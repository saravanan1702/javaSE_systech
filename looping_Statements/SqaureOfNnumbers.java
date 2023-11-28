package looping_Statements;

import java.util.Scanner;

public class SqaureOfNnumbers {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N Numbers");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			sum = sum + i * i;
		}
		System.out.println("Squre of n number is :"+sum);
	}
}
