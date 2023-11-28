package oops.inheritance;

public class Publlic_Variable extends PublicBaseExample {
	int m = 30;
	int s = 50;
	int r;

	public Publlic_Variable(int a, int b) {
		super(a, b);
	}
    public void rect() {
    	r=m*s;
    	System.out.println("Rectangle Value is :"+r);
    }
    public void squre() {
    	r=m*m;
    	System.out.println("Squre value is :"+r);
    }
}
