package Conditional_statement;

import java.util.Scanner;

public class LeapYearNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		System.out.println("Enter the Year :");
		x = s.nextInt();
		if ((x % 4 == 0)) {
			System.out.println("Leap year ");
		}else {
			System.out.println("Not a Leap Year ");
		}
	}
}
