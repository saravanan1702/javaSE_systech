package Conditional_statement;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter The Value :");
		n = s.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even ");
		} else {
			System.out.println("Odd");
		}
	}
}
