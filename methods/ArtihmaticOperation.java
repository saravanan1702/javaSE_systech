package methods;

import java.util.Scanner;

public class ArtihmaticOperation {
	static void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum of two number is :" + c);
	}

	static void sub(int a, int b) {
		int c = a - b;
		System.out.println("Subtract of two number is :" + c);
	}

	static void mul(int a, int b) {
		int c = a * b;
		System.out.println("Product of two number is :" + c);
	}

	static void div(float a, float b) {
		float c = a / b;
		System.out.println("Divide of two number is :" + c);
	}

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The two Numbers :");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        add(num1,num2);
        sub(num1,num2);
        mul(num1,num2);
        div(num1,num2);
	}
}
