package pattern_program_forloop;

import java.util.Scanner;

public class NumberPattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The Number :");
		n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
	}
}
