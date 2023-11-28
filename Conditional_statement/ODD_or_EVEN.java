package Conditional_statement;

import java.util.Scanner;

public class ODD_or_EVEN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("Enter the Values :");
		a=s.nextInt();
		if(!(a%2==0)) {
			System.out.println("ODD");
		}else {
			System.out.println("EVEN");
		}
	}
}
