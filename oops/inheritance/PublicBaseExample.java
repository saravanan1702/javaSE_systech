package oops.inheritance;

public class PublicBaseExample {
	int m = 90;
	int s = 50;
	int r;

	PublicBaseExample(int x, int y) {
		m = x;
		s = y;

	}
	public void add() {
		r=m+s;
		System.out.println("Addition Value is :"+r);
	}
	public void sub() {
		r=m-s;
		System.out.println("Subtraction Value is :"+r);
	}
}
