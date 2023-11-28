package Logical_operators;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y;
		System.out.println("Enter the value of x :");
		x=s.nextInt();
		System.out.println("Enter the value of x :");
		y=s.nextInt();
		System.out.println("Bitwise AND : ");
		System.out.println(x&y);
		System.out.println("Bitwise OR :");
		System.out.println(x|y);
		System.out.println("Bitwise XOR :");
		System.out.println(x^y);
		

	}

}
