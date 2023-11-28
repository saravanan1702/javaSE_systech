package methods;

import java.util.Scanner;

public class FactorialOfNumber {
	static int store(int n) {
		//anything multiple by zero will  be zero
		int fact = 1;
		for (int i = 1; i <=n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n=sc.nextInt();
		int m=store(n);
		System.out.println("Factorial of N number is :"+m);
	}
}
