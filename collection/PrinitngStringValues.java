package collection;

import java.util.Scanner;

public class PrinitngStringValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N number :");
		n = sc.nextInt();
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		System.out.println("Result is :");
		for (String x : str) {
			System.out.print(x + " ");
		}
	}
}
