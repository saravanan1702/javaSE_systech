package arrays;

import java.util.Scanner;

public class NagativeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		int count = 0;
		System.out.println("Enter the n value :");
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the value of a[" + i + "] :");
			arr[i] = sc.nextInt();
		}
		System.out.println("Nagative Number is :");
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
				sum -= arr[i];
				count++;
			}
			System.out.println();
		}
		System.out.println("sum of Negative values :" + (-sum));
		System.out.println("Count of Negative Numbers :" + count);
	}
}
