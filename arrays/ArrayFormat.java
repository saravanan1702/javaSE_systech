package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFormat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N values :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value :");
			arr[i] = sc.nextInt();

		}
		System.out.println("Result is :");
		System.out.println(Arrays.toString(arr));
	}
}
