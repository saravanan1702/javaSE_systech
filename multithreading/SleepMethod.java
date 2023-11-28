package multithreading;

public class SleepMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SleepMethod m1=new SleepMethod();
		SleepMethod m2=new SleepMethod();
		m1.start();
		m2.start();
	}
}
