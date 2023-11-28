package multithreading;
class A1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread A="+i);
		}
		System.out.println("End of Thread A");
	}
}
class B1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread B="+i);
		}
		System.out.println("End of Thread B");
	}
}
public class CreatingthreadWithInheritance {
	public static void main(String[] args) {
      A1 a=new A1();
      B1 b=new B1();
      a.setPriority(Thread.MAX_PRIORITY -2);
      b.setPriority(Thread.MIN_PRIORITY +2);
      a.start();
      b.start();
      System.out.println("End of Main Thread");
	}
}
