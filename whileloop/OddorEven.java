package whileloop;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start;
		System.out.println("Enter The Number :");
		start = sc.nextInt();
		while (start != 1000 && start < 1000) {
			if (start % 2 == 0) {
				System.out.println(start + " is Even Number");
			} else {
				System.out.println(start + " is Odd Number");
			}
			System.out.println("Enter The Number :");
			start = sc.nextInt();

		}
	}
}
