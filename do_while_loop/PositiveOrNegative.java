package do_while_loop;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, x = 0, y = 0;
		System.out.println("Enter the Value :");
		a = sc.nextInt();
		do {
			if (a > 0) {
				x += a;
			} else {
				y -= a;
			}
			System.out.println("Enter the value :");
			a = sc.nextInt();

		} while (a != 1000);
		System.out.println("Positive sum is :" + x);
		System.out.println("Negative sum is :" + -(y));
	}
}
