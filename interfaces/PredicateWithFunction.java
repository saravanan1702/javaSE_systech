package interfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateWithFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Predicate<Integer> p = a -> a % 2 == 0;

		System.out.println("Enter The N value :");
		int n;
		n = sc.nextInt();
		while (n != 0) {
			n = sc.nextInt();
			System.out.println("Enter the x :");
			int x = sc.nextInt();
			System.out.println();
			if (p.test(x)) {
				System.out.println(x + " Even Number ");

			} else {
				System.out.println(x + " Odd Number");

			}
		}
	}
}