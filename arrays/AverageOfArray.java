package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {
	public static void main(String[] args) {
		int n, sum = 0;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N Number :");
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Index Values :");
			a[i] = sc.nextInt();
		}
		System.out.println("Array is :");
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println("Sum of Array is :" + sum);
		avg = sum / n;
		System.out.println("Average of Array is :" + avg);

	}
}
