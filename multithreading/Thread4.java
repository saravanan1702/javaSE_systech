package multithreading;

class ThreadPro1 implements Runnable {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is Working");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class Thread4 {
	public static void main(String[] args) {
     int n=8;
     for(int i=0;i<8;i++) {
    	 Thread object=new Thread(new ThreadPro1());
    	 object.start();
     }
	}
}
