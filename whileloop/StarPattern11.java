package whileloop;

import java.util.Scanner;

public class StarPattern11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
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
			i++;
		}
		i = n-1;
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
