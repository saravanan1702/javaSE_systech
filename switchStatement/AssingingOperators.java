package switchStatement;

import java.util.Scanner;

public class AssingingOperators {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c = 1, opt;
		System.out.println("Enter First value :");
		a = s.nextInt();
		System.out.println("Enter Second Value :");
		b = s.nextInt();
		System.out.println("Enter the any one option 1 or 2 or 3 or 4");
		opt = s.nextInt();
		switch (opt) {
		case 1: {
			c = a + b;
			System.out.println("Result is :" + c);
			break;
		}
		case 2: {
			c += a;
			System.out.println("Result is :" + c);
			break;
		}
		case 3: {
			c -= a;
			System.out.println("Result is :" + c);
			break;
		}
		case 4: {
			c /= a;
			System.out.println("Result is :" + c);
			break;
		}
		default:
			System.out.println("Error");
			break;
		}
	}
}
