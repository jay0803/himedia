package thread02;

public class ThreadA extends Thread {	
	//이름 지정하지 않으면 Thread-0으로 표시
	public ThreadA() {
		setName("ThreadA");
	}
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
			System.out.println(getName() + "가 출력한 내용");
			System.out.println(getName() + "가 출력한 내용");
			System.out.println(getName() + "가 출력한 내용");
			System.out.println(getName() + "가 출력한 내용");
			System.out.println("\n");
		}
	}
}

