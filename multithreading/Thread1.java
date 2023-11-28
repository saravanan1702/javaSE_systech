package multithreading;

public class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread Created");
	}

	public static void main(String[] args) {
		Thread1 thread = new Thread1();
		thread.start();
		System.out.println("Thread Completed");
	}
}
