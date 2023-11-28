package do_while_loop;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n;
		System.out.println("Enter the Number :");
		n = sc.nextInt();
		int i = 1;
		do {
			System.out.println("Enter the Year :");
			x = sc.nextInt();
			if (x % 4 == 0) {
				System.out.println(x + " is leap Year");
			} else {
				System.out.println(x + " is not a leap Year");
			}
			i += 1;
		} while (i <= n);
	}
}
