package switchStatement;

import java.util.Scanner;

public class Mathematical_Operators {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, opt;
		float c;
		System.out.println("Enter The First Value :");
		a = s.nextInt();
		System.out.println("Enter the Second Value :");
		b = s.nextInt();
		System.out.println("Enter The any one option : 1 or 2 or 3 or 4");
		opt = s.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Area of Square");
			c = a * a;
			System.out.println("Result :" + c);
			break;

		case 2:
			System.out.println("Area of Rectangle ");
			c = a * b;
			System.out.println("Result :" + c);
			break;
		case 3:
			System.out.println("Area of Circle :");
			float pi = 3.14f;
			c = pi * a * a;
			System.out.println("Result :" + c);
			break;
		default:
			System.out.println("Error");
			break;

		}
	}
}
