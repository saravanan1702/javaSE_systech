package whileloop;

import java.util.Scanner;

public class AverageOf5Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e, n, sum;
		float avg;
		System.out.println("Enter the N Number :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.print("Enter The first value :");
			a = sc.nextInt();
			System.out.print("Enter 2nd Value :");
			b = sc.nextInt();
			System.out.print("Enter The 3rd Value :");
			c = sc.nextInt();
			System.out.print("Enter the 4th Value :");
			d = sc.nextInt();
			System.out.println("Ente the 5th Value :");
			e = sc.nextInt();
			sum = a + b + c + d + e;
			avg = sum / n;
			System.out.println("Average of 5 values is :" + avg);
			i++;

		}
	}
}
