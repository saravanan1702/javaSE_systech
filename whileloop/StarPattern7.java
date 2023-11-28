package whileloop;

import java.util.Scanner;

public class StarPattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N values :");
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
				System.out.print("*");
				k++;
			}
			System.out.println("");
			i = i + 1;
		}
		i = 1;
		while (i <=n) {
			int j = 1;
			while (j <= i+1) {
				System.out.print(" ");
				j++;
			}
			int k = i;
			while (k <n) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
