package switchStatement;

import java.util.Scanner;

public class Arithmatic_operation {
	public static void main(String[] args) {
		int a, b, c, opt;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The First Value :");
		a = s.nextInt();
		System.out.println("Enter The Second Value :");
		b = s.nextInt();
		System.out.println("Enter The any Option 1 or 2 or 3 or 4 ");
		opt = s.nextInt();
		switch (opt) {
		case 1: {
			c = a + b;
			System.out.println("Addition Value is :" + c);
			break;
		}
		case 2: {
			c = a - b;
			System.out.println("Substraction Value is :" + c);
			break;
		}
		case 3: {
			c = a * b;
			System.out.println("Multiply Value is :" + c);
			break;

		}
		case 4: {
			c = a / b;
			System.out.println("Division Value is :" + c);
			break;
		}
		default:
			System.out.println("Error");
			break;
		}
	}
}
