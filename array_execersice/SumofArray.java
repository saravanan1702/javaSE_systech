package array_execersice;

import java.util.Scanner;

public class SumofArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println("Sum of all the element in array :"+sum);
	}
}
