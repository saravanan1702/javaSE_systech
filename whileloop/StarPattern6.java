package whileloop;

import java.util.Scanner;

public class StarPattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(" ");
				j++;
			}
			int k = i;
			while (k <= n) {
				System.out.print("*");
				k++;
			}
			System.out.println("");
			i++;

		}
	}
}
