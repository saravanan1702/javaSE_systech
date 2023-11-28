package switchStatement;

import java.util.Scanner;

public class Unary_Operators {
	public static void main(String[] args) {
		int a, c, opt;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Value :");
		a = s.nextInt();
		System.out.println("Enter Any One Option : 1 or 2 or 3 or 4");
		opt = s.nextInt();
		switch (opt) {
		case 1:
			c = +a;// c=c+a;
			System.out.println("Unary + Value :" + c);
			break;
		case 2:
			c = -a;
			System.out.println("Unary - value :" + c);
			break;
		case 3:
			c = ++a; // c=++a;
			System.out.println("Unary ++ value :" + c);
			break;
		case 4:
			c = --a;
			System.out.println("Unary --value   :" + c);
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}
