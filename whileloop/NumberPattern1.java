package whileloop;

import java.util.Scanner;

public class NumberPattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N values :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
