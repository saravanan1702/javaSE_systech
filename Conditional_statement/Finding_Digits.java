package Conditional_statement;

import java.util.Scanner;

public class Finding_Digits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char m;
		System.out.println("Enter Any Charactor /digit");
		m=s.next().charAt(0);
		if(m>='0' && m<='9') {
			System.out.println("Its Digits...");
		}else {
			System.out.println("Not Digits..");
		}
	}
}
