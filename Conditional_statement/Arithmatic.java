package Conditional_statement;

import java.util.Scanner;

public class Arithmatic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char k;
		System.out.println("Enter Any Charactor :");
		k = s.next().charAt(0);
		if (k == '+' || k == '-' || k == '/' || k == '*' || k == '%') {
			System.out.println("Aarithmatic Operator");
		} else {
			System.out.println("Not Arithmatic Operator");
		}
	}

}
