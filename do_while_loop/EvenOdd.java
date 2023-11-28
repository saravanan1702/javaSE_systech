package do_while_loop;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start;
		System.out.println("Enter the Start Value :");
		start = sc.nextInt();
		do {
			if (start % 2 == 0) {
				System.out.println(start + " is Even Number");
			} else {
				System.out.println(start + " is Odd Number");
			}
			System.out.println("Enter the Number :");
			start = sc.nextInt();
		} while (start != 1000 && start < 1000);
	}
}
