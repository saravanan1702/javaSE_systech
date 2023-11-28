package oops.inheritance;

import java.util.Scanner;

interface Addition {
	default public void add(int x, int y) {
		int z;
		z = x + y;
		System.out.println("Addition is :" + z);
	}

	default public void sub(int x, int y) {
		int z;
		z = x - y;
		System.out.println("Subtraction is :" + z);

	}
}

interface ArithmaticDemo {
	default public void mul(int x, int y) {
		int z;
		z = x * y;
		System.out.println("Multiplication is :" + z);

	}

	default public void div(int x, int y) {
		int z;
		z = x / y;
		System.out.println("Division is :" + z);
	}
}

public class InterFaceDemo2 implements Addition,ArithmaticDemo{
	public static void main(String[] args) {
		InterFaceDemo2 i=new InterFaceDemo2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The first Number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter The Second Number 2:");
		int num2=sc.nextInt();
		i.add(num1, num2);
		i.sub(num1, num2);
		i.mul(num1, num2);
		i.div(num1, num2);
	}
}
