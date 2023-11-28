package multithreading;
class Testing extends Thread{
	public Testing(String s) {
		super(s);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName());
		}
	}
}
public class Thread7 {
public static void main(String[]args) {
	Testing t1=new Testing("Thread1");
	Testing t2=new Testing("Thread2");
	t1.start();
	t2.start();
}
}
