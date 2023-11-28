package conditional_nested_if;

import java.util.Scanner;

public class Finding_Alphapat_Digit {
	public static void main(String[] args) {
		char m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Charactor :");
		m = s.next().charAt(0);
		if ((m >= 'a' && m <= 'z') || (m >= 'A' && m <= 'Z')) {
			System.out.println("It is Alphabet");
		} else if (m >= '0' && m <= '9') {
			System.out.println("It is Digits");
		} else {
			System.out.println("Not Alphabet and Digits");
		}
	}
}
