package Conditional_statement;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char c;
		System.out.println("Enter The Charactor :");
		c=s.next().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u') {
			System.out.println("vowel");
		}else {
			System.out.println("Not Vowel");
		}

	}

}
