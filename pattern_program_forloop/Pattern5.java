package pattern_program_forloop;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N Values :");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
