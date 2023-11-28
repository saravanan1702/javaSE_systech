package oops.inheritance;

import java.util.Scanner;

class Base4Task {
	int m = 30, s = 50, r;

	Base4Task(int x, int y) {
		m = x;
		s = y;
	}

	void add() {
		r = m + s;
		System.out.println("Addition Vaolue is :" + r);
	}

	void sub() {
		r = m - s;
		System.out.println("Subtraction value is :" + r);
	}

	void mul() {
		r = m * s;
		System.out.println("Multiply Value is :" + r);
	}
}

public class ArtihmaticTask extends Base4Task {

	ArtihmaticTask(int x, int y) {
		super(x, y);

	}

	// constrcutor overloading
	ArtihmaticTask(int a, int b, int c) {
		super(a, b);
		int total = a + b + c;
		System.out.println("Total :" + total);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		ArtihmaticTask ar = new ArtihmaticTask(n1, n2);
		ar.add();
		ar.sub();
		ar.mul();
		  System.out.println("\n"); System.out.println("Connstructor overloading");
		  //creating object for multiple constrcutor ArtihmaticTask ar2=new
		  ArtihmaticTask ar2=new ArtihmaticTask(10,20,30) ;
		 
	}
}
