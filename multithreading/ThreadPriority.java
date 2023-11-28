package multithreading;

public class ThreadPriority extends Thread{
	public void run() {
		System.out.println("Prioriy is :" + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		ThreadPriority p=new ThreadPriority();
	    p.setPriority(Thread.MIN_PRIORITY);
	    p.start();
	}
}
