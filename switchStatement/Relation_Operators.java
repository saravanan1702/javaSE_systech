package switchStatement;

import java.util.Scanner;

public class Relation_Operators {
	public static void main(String[] args) {
		int a, b, opt;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Value :");
		a = s.nextInt();
		System.out.println("Enter the Second Values :");
		b = s.nextInt();
		System.out.println("Enter The Any one Option :1 or 2 or 3 or 4");
		opt = s.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Equal or Not Equal Condiion");
			if (a == b) {
				System.out.println("Equal ");
			} else {
				System.out.println("Not Equal");
			}
			break;
		case 2:
			System.out.println("GreaterThan Condition");
			if (a > b) {
				System.out.println("A is Greater");
			} else {
				System.out.println("B is Greater");
			}
			break;
		case 3:
			if (a < b) {
				System.out.println("A is Lesser");
			} else {
				System.out.println("B is lesser");
			}
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}
