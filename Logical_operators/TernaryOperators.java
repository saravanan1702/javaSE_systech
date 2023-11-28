package Logical_operators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a:");
		a=s.nextInt();
		System.out.println("Enter b:");
		b=s.nextInt();
		c=(a>b)?a:b;
		System.out.println("Biggest Value is :"+c);
		
		

	}

}
