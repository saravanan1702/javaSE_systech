package array_execersice;

import java.util.Scanner;

public class AverageValueofArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size :");
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;
		float avg;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the Element " + i + " :");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		avg = sum / n;
		System.out.println("Sum of  Array is :" + sum);
		System.out.println("Average of Array is:" + avg);

	}
}
