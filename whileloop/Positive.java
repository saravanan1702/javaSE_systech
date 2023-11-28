package whileloop;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter The Value :");
		a = sc.nextInt();
		while (a != 1000) {
			if (a > 0) {
				System.out.println(a + " positive");
			} else if (a < 0) {
				System.out.println(a + " Negative");
			} else {
				System.out.println(a + " Zero");
			}
			System.out.println("Enter The Value :");
			a = sc.nextInt();

		}
	}
}
