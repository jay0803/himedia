package thread01;

public class BeepTask implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("동");
			System.out.println("동");
			System.out.println("동");
			System.out.println("동");
			System.out.println("동");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
