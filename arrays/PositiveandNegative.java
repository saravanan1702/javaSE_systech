package arrays;

import java.util.Scanner;

public class PositiveandNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, ps = 0, ns = 0, nc = 0, pc = 0;
		System.out.println("Enter The Value :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Value :");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				ps += a[i];
				pc++;
			} else {
				ns += a[i];
				nc++;
			}
		}
		System.out.println("count of Positive :" + pc);
		System.out.println("sum of Positive :" + ps);
		System.out.println("Count of  Negative :" + nc);
		System.out.println("sum of Negative :" + (-ns));
	}
}
