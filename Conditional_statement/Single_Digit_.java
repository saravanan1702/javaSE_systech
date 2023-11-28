package Conditional_statement;

import java.util.Scanner;

public class Single_Digit_ {
	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Values :");
		x=s.nextInt();
		if(x>=0 && x<=9) {
			System.out.println("Sigle Digit ");
		}else {
			System.out.println("Not a single Digit");
		}
	}

}
