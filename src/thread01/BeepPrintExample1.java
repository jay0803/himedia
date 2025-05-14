package thread01;

public class BeepPrintExample1 {
	public static void main(String[] args) { //메인스레드
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			//Thread.sleep: => 현재 작업중인 스레드를 잠깐 재워라
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("동");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
