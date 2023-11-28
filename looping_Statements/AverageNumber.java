package looping_Statements;

import java.util.Scanner;

public class AverageNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, d, e, n, sum = 0;
		float avg;
		System.out.println("Enter The N Number :");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter 1st Value :");
			a = s.nextInt();
			System.out.println("Enter 2nd Value :");
			b = s.nextInt();
			System.out.println("Enter 3rd Value :");
			c = s.nextInt();
			System.out.println("Enter 4th value :");
			d = s.nextInt();
			System.out.println("Enter 5th Value :");
			e = s.nextInt();
			sum=a+b+c+d+e;
			avg = sum / n;
			System.out.println("Average of 5 values is :" + avg);

		}

	}
}
