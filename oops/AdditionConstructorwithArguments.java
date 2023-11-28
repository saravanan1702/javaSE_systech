package oops;

import java.util.Scanner;

class Arith3 {
	int m, s, r;

	public void add(int x, int y) {
		//assinging arugment to local variable
		m = x;
		s = y;
		r = m + s;

	}

	void printing() {
		System.out.println("Addition Value is :" + r);
	}
}

public class AdditionConstructorwithArguments {
	public static void main(String[] args) {
		Arith3 a=new Arith3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number 1 :");
		int num1=sc.nextInt();
		System.out.println("Enter The Number 2 :");
		int num2=sc.nextInt();
		a.add(num1, num2);
		a.printing();

	}
}
