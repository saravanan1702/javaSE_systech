package whileloop;

import java.util.Scanner;

public class StartPattern10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N value :");
		n = sc.nextInt();
		int i = n;
		while (i > 0) {
			int j = i;
			while (j <= n) {
				System.out.print(" ");
				j++;
			}
			int k = 1;
			while (k <= i) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			i--;

		}
	}
}
