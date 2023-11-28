package looping_Statements;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1, n;
		System.out.println("Enter N Number :");
		n = sc.nextInt();
		if (n < 0) {
			System.out.println("Enter Correct Value");
		} else {
			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
		}
		System.out.println("Factorial Value is :" + fact);

	}
}
