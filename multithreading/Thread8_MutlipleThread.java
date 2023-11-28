package multithreading;
class A extends Thread{

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Programming");
		}
	}
}
class B extends Thread{

	public void run() {
		System.out.println("Saravanan");
	}
}
class C extends Thread{

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Java");
		}
	}
}
public class Thread8_MutlipleThread {
	public static void main(String[] args) {
       System.out.println("Start");
       A a=new A();
       B b=new B();
       C c=new C();
       a.start();
       b.start();
       c.start();
       System.out.println("Completed!!");
       
	}
}
