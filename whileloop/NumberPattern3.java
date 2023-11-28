package whileloop;

import java.util.Scanner;

public class NumberPattern3 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N :");
		n = sc.nextInt();
		int i = n;
		while (i > 0) {
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i = i -1;
		}

	}
}
