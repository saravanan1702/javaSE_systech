package oops.inheritance;
class Base10{
	int x,y,z;
	void add(int a,int b) {
		x=a;
		y=b;
		z=x+y;
		System.out.println("Sum of Two Number is :"+z);
	}
	void sub(int a,int b) {
		x=a;
		y=b;
		z=a-b;
		System.out.println("Sum of two number is :"+z);
	}
}
public class Mathimatical extends Base10{
	public static void main(String[] args) {
		int a=10;
		int b=5;
		Mathimatical m=new Mathimatical();
		m.add(a, b);//15
		m.sub(a, b);//5
  
	}
}
