package thread04;
class StaticIns{
	public void prt(String nm){
		System.out.println(nm+"에서 공유객체 메소드 실행");
	}
}

//조건: wait() / notify()는 반드시 synchronized (객체) 블록 안에서만 사용 가능
public class ThreadWait {
	public static void main(String[] args) {
		// 자바 객체들은 모두 자기만의 열쇠(lock)를 가지고 있음.
		// 스레드 객체 또한 thread가 생성되면
		// 해당 thread는 run메서드 안에서 자신의 모니터링 락을 획득
		StaticIns lock = new StaticIns(); // 공유 객체

		ThreadA a = new ThreadA(lock);
		ThreadB b = new ThreadB(lock);

		a.start();
		System.out.println("a스레드 이어서 실행");
		b.start();
		System.out.println("b스레드 이어서 실행");
		System.out.println("main스레드 이어서 실행");

//		synchronized블록 :한 객체(공유객체)에 대해 한 번에 하나의 스레드만 접근하게 함 (lock 개념)
		synchronized (lock) {
//			synchronized블록안에 들어오면 lock객체에 대해 모니터링 락을 가짐.
//			다른 스레드는 이 블록에 들어오지 못하게 됨
			System.out.println("Main스레드 wait() 호출로 대기 중...");
			try {
				System.out.println("Main스레드 lock전");
//				wait(): 현재 스레드를 해당 객체(공유객체)에 대해 대기 상태로 만듦
//				(다른 스레드가 notify할 때까지)
				lock.wait(); // 다른 스레드가 notify() 할 때까지 대기
				lock.prt("Main");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main스레드: notify로 깨워짐! 작업 재개.");
		}

	}
}

// a스레드는 run() 시작하자마자 wait()로 대기함
class ThreadA extends Thread {
	private final StaticIns lock;

	public ThreadA(StaticIns lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			System.out.println("ThreadA: wait() 호출로 대기 중...");
			try {
				System.out.println("ThreadA객체의 run메소드 진입. lock전");
				lock.wait(); // 다른 스레드가 notify() 할 때까지 대기
				lock.prt("ThreadA");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadA: notify로 깨워짐! 작업 재개.");
//			notify(); 는 반드시 synchronized블록에서만 사용가능하다.
			lock.notify(); // 대기 중인 다른 스레드를 깨움
		}
	}
}

// ThreadB는 시간이 걸리는 작업을 마친 뒤 notify()로 ThreadA를 깨움
class ThreadB extends Thread {
	private final StaticIns lock;
	int total;

	public ThreadB(StaticIns lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			lock.prt("ThreadB");
			for (int i = 0; i < 5; i++) {
				System.out.println("ThreadB : " + i);
				total += i;
				try {
					Thread.sleep(1000); // 작업 중
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("ThreadB: 작업 완료 후 notify 호출!");
			lock.notify(); // 대기 중인 다른 스레드 한 개를 깨움
//			lock.notifyAll(); // 대기 중인 다른 모든 스레드를 깨움
		}

		System.out.println("ThreadB: 종료");
	}
}
