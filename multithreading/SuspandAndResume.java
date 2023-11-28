package multithreading;

public class SuspandAndResume extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				sleep(500);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SuspandAndResume t1=new SuspandAndResume();
		SuspandAndResume t2=new SuspandAndResume();
		SuspandAndResume t3=new SuspandAndResume();
		t1.start();
		t2.start();
		t2.suspend();
		t3.start();
		t2.resume();
	}
}
