package whileloop;

import java.util.Scanner;

public class StarPattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = i;
			while (j <= n) {
				System.out.print(" ");
				j++;//printing spaces
			}
			int k = 1;
			while (k <= i) {
				System.out.print("*");
				k++;//printing starts
			}
			System.out.println("");
			i++;//for next line or row

		}

	}
}
