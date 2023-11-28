package oops;

import java.util.Scanner;

class Base01 {
	int add(int x, int y) {
		int z;
		z = x + y;
		return z;
	}
}

class Base02 extends Base01 {
	int sub(int x, int y) {
		int z;
		z = x - y;
		return z;
	}
}

public class MultipleInheitanceTask03 extends Base02 {
	public static void main(String[] args) {
		MultipleInheitanceTask03 m=new MultipleInheitanceTask03();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Value :");
		int n=sc.nextInt();
		System.out.println("Enter the Second value :");
		int n1=sc.nextInt();
		int addition=m.add(n, n1);
		System.out.println("Addition of two value :"+addition);
		int subtraction=m.sub(n, n1);
		System.out.println("Subtraction 2 value :"+subtraction);
		
	}
}
