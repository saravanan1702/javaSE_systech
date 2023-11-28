package whileloop;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n;
		System.out.println("Enter Starting year :");
		x = sc.nextInt();
		System.out.println("Enter Ending Year :");
		n = sc.nextInt();
		while (x <= n) {
			if (x % 4 == 0) {
				System.out.println(x + "  is leap year ");
			} else {
				System.out.println(x + " is not a leap year");
			}
			x = x + 1;
		}
	}
}
