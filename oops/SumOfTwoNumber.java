package oops;

import java.util.Scanner;

class Sum {
	int x, y, z;

	void add(int a, int b) {
		x = a;
		y = b;
		z = x + y;
		System.out.println("Sum of Two Values is :" + z);
	}
}

public class SumOfTwoNumber {
	public static void main(String[] args) {
		Sum s=new Sum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The first value :");
		int n=sc.nextInt();
		System.out.println("Enter the second value :");
		int m=sc.nextInt();
		s.add(n, m);

	}
}
