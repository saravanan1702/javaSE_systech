package do_while_loop;

import java.util.Scanner;

public class LeapYearNoNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n;
		System.out.println("Enter Starting year :");
		x = sc.nextInt();
		System.out.println("Enter Ending Year :");
		n = sc.nextInt();
		do {
			if (x % 4 == 0) {
				System.out.println(x + " is Leap Year ");
			} else {
				System.out.println(x + " is Not a leap Year ");
			}
			x = x + 1;
		} while (x <= n);
	}
}
