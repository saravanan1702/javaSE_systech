package whileloop;

import java.util.Scanner;

public class DivisibleOrNotDivisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter The Value :");
		a = sc.nextInt();
		while (a != 500) {
			if (a % 3 == 0) {
				System.out.println(a + " divisible by 3");
			} else {
				System.out.println(a + " Not divisible by 3");
			}
			System.out.println("Enter The Value :");
			a = sc.nextInt();
		}
	}
}
