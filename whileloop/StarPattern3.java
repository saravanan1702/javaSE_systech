package whileloop;

import java.util.Scanner;

public class StarPattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		i = 1;
		while (i <= n) {
			j = 1;
			while (j <= i) {
				System.out.print("*");
				j += 1;
			}
			i = i + 1;
			System.out.println();
		}

	}
}
