package multithreading;

public class Suspendingthread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
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
		Suspendingthread t1=new Suspendingthread();
		Suspendingthread t2=new Suspendingthread();
		Suspendingthread t3=new Suspendingthread();
		t1.start();
		t2.suspend();
		t3.start();
	}
}
