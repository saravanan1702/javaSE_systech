package whileloop;

import java.util.Scanner;

public class StarPattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		System.out.println("Enter The n value :");
		n = sc.nextInt();
		i = 1;
		while (i <= n) {
			j = 1;
			while (j <= n) {
				System.out.print("*");
				j += 1;
			}
			i += 1;
			System.out.println();

		}
	}
}
