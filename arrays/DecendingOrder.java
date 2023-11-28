package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DecendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N value :");
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter The  value of a[" + i + "] :");
			arr[i] = sc.nextInt();

		}
		System.out.println("Array is :");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println("Decending Order :");
		System.out.println(Arrays.toString(arr));
	}
}
