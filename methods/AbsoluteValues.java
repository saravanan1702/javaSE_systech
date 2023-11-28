package methods;

import java.util.Scanner;

public class AbsoluteValues {
	static int abs(int x) {
		if (x > 0) {
			return x;
		} else {
			return -(x);
		}
	}
	public static void main(String[] args) {
		int n,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		n=sc.nextInt();
		t=abs(n);
		System.out.println("Absolute of "+n+" is "+t);
	}
}
