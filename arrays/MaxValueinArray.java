package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueinArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		System.out.println("Enter The N values :");
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The value of arr[" + i + "] :");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is :");
		System.out.println(Arrays.toString(arr));
		m = arr[0];
		for (int i = 0; i < n; i++) {
			if (m < arr[i]) {
				m = arr[i];
			}
		}
		System.out.println("Maxium value is :" + m);

	}
}
