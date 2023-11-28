package Conditional_statement;

import java.util.Scanner;

public class Positive_or_Negative {
	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The values :");
		a=s.nextInt();
		if(a>0) {
			System.out.println("+ve");
		}
		else {
			System.out.println("-ve");
		}
	}

}
