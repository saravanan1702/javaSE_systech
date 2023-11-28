package oops;

public class Example {
	int x=100;
	public static void main(String[] args) {
		Example ex=new Example();
		System.out.println("value of x :"+ex.x);
		//we can call this varible with annoymous object also
		System.out.println("Value of X :"+new Example().x);
     
	}
}
