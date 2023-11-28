package do_while_loop;

import java.util.Scanner;

public class AverageNnumbers {
	public static void main(String[] args) {
		int a, b, c, d, e, n, sum;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Number :");
		n = sc.nextInt();
		int i = 1;
		do {
			System.out.println();
			System.out.print("Enter the 1st Value :");
			a = sc.nextInt();
			System.out.print("Enter 2nd Value :");
			b = sc.nextInt();
			System.out.print("Enter the 3rd Value :");
			c = sc.nextInt();
			System.out.print("Enter the 4th Value :");
			d = sc.nextInt();
			System.out.print("Enter the 5th value :");
			e = sc.nextInt();
			sum = a + b + c + d + e;
			avg = sum / n;
			System.out.println("Average of 5 value is :" + avg);
			i += 1;
		} while (i <= n);

	}
}
