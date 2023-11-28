package whileloop;

import java.util.Scanner;

public class StartPattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N values :");
		n = sc.nextInt();
		int i = n;
		while (i > 0) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j = j + 1;
			}
			i -= 1;
			System.out.println();
		}
	}
}
