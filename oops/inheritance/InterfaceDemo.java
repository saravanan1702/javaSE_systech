package oops.inheritance;
 interface InterDemo{
	 static int x=10;
	void demo1();
	void demo2();
	//1st method
	
	public static void meth1() {
		System.out.println("x value is :"+x);
	}
	//2nd method
	default void meth2() {
		System.out.println("Method 2 from inside Interface");
	}
	
}
 class InterDemo2 implements InterDemo{
	 public //must be override the superclass of interface
	 void demo1() {
		 System.out.println("Meth 1");
	 }
	 public void demo2() {
		 System.out.println("meth 2");
	 }
 }
public class InterfaceDemo {
	public static void main(String[] args) {
      InterDemo.meth1();
      InterDemo2 i=new InterDemo2();
      i.meth2();
	}
}
