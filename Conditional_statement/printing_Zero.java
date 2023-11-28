package Conditional_statement;

import java.util.Scanner;

public class printing_Zero {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c;
		System.out.println("Enter The Values :");
		c=s.nextInt();
//		!=mean if conditon is true it will give ans as false 
		if(!(c==0)) {
			System.out.println("Not Zero");
		}
		else {
			System.out.println("Zero");
		}
	}

}
