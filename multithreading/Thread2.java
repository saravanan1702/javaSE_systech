package multithreading;

class Threadingpro extends Thread {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId());
		} catch (Exception e) {
			System.out.println("Exception is Caught");
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
      int n=5;
      for(int i=0;i<5;i++) {
    	  Threadingpro s=new Threadingpro();
    	  s.start();
      }
	}
}
