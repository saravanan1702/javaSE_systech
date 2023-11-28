package oopsInheitance;

import java.util.Scanner;

class Base {
	int m = 30;
	int s = 30;
	int r;

	Base(int x, int y) {
		m = x;
		s = y;
	}

	int add() {
		r = m + s;
		return r;
	}

	int sub() {
		r = m - s;
		return r;
	}

}

public class Single extends Base {
	public Single(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Value :");
		int n1=sc.nextInt();
		System.out.println("Enter The Second Value :");
	    int n2=sc.nextInt();
	    Single s=new Single(n1,n2);
	    int t1=s.add();
	    int t2=s.sub();
	    System.out.println("Addition Value is :"+t1);
	    System.out.println("Subtraction Value is :"+t2);
	}
}
