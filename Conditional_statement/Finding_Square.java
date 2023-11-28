package Conditional_statement;

import java.util.Scanner;

public class Finding_Square {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length, breadth;
		System.out.println("Enter The First Value :");
		length = s.nextInt();
		System.out.println("Enter The Second Value :");
		breadth = s.nextInt();
		if (length == breadth) {
			System.out.println("its Squre ");
		} else {
			System.out.println("it is Rectangle");
		}
	}
}
