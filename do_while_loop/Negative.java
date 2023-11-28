package do_while_loop;

import java.util.Scanner;

public class Negative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a, x = 0, y = 0;
		System.out.println("Enter  the N Value :");
		n = sc.nextInt();
		int i = 1;
		do {
			System.out.println("Enter The Number :");
			a = sc.nextInt();
			if (a > 0) {
				x += a;
			} else {
				y -= a;
			}
			i = i + 1;
		} while (i <= n);
		System.out.println("Sum of Positive Number :" + x);
		System.out.println("Sum of Negative Number :" + -(y));
	}
}
