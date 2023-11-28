package conditional_nested_if;

import java.util.Scanner;

public class FindingNegative_numbers {
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Value :");
		a = s.nextInt();
		if (a >= 0) {
			if (a == 0) {
				System.out.println("Zero");
			} else {
				System.out.println("Positive");
			}
		}else {
			System.out.println("Negative");
		}
	}
}
