package methods;

import java.util.Scanner;

public class CreatingArrayFunction {
	static int[] printing(int t) {
		int x[] = new int[t];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < t; i++) {
			System.out.println("Enter The value :");
			x[i] = sc.nextInt();

		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		int a[] = new int[n];
		a = printing(n);
		System.out.println("Result is :");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}
}
