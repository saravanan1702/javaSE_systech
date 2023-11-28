package oops.inheritance;
class SuperDemo{
	void supDemo() {
		System.out.println("Hello,i'm super class");
	}
}
 class SubDemo extends SuperDemo{
	void subDemo() {
		System.out.println("Hello,i'm subclass demo");
	}
}
public class MainClassDemo extends SubDemo {
	public static void main(String[] args) {
      MainClassDemo d=new MainClassDemo();
      d.supDemo();
      d.subDemo();
	}
}
