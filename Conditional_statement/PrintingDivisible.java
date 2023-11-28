package Conditional_statement;

import java.util.Scanner;

public class PrintingDivisible {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int a;
			System.out.println("Enter the Values :");
			a=s.nextInt();
			if(a%3==0) {
				System.out.println("Divisible by 3");
			}else {
				System.out.println("Not Divisible by 3");
			}
	}
}
