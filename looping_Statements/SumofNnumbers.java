package looping_Statements;

import java.util.Scanner;

public class SumofNnumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		System.out.println("Enter N number :");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of N number is :"+sum);
	}
}
