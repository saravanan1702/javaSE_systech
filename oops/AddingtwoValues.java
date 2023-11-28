package oops;

import java.util.Scanner;

class Addition {
	int m = 100, s = 200, r;

	public void add(int x, int y) {
		r = m + s;
		r=x+y;
		System.out.println("Addition value is Local values :" + r);
		System.out.println("Addition value is passing values :" + r);
	}
}

public class AddingtwoValues {
	public static void main(String[] args) {
		Addition addition = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The firsr value:");
		int a=sc.nextInt();
		System.out.println("Enter The second value:");
		int b=sc.nextInt();
	    addition.add(a, b);

	}
}
