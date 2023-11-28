package methods;

import java.util.Scanner;

public class SumOfArray {
	static int sum(int a[]) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];

		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int t = sum(a);
		System.out.println("Sum of Array is :" + t);
	}
}
