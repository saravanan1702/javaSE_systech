package arrays;

import java.util.Scanner;

public class ArrayReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N values :");
		int n;
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter The value of a[" + i + "] :");
			a[i] = sc.nextInt();

		}
		System.out.println("Result is :");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

	}
}
