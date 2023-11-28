package pattern_program_forloop;

import java.util.Scanner;

public class StarPattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N Values :");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) { // for line
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");// for space
			}
			for (int k = i; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
