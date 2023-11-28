package looping_Statements;

import java.util.Scanner;

public class Divisible_By_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, n;
		System.out.println("Enter First Number :");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		n = sc.nextInt();
		for (int i = a; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " Divisible by 3");
			} else {
				System.out.println(i + " Not Divisible by 3");
			}
		}
	}
}
