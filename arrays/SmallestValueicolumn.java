package arrays;

import java.util.Scanner;

public class SmallestValueicolumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of Array :");
		int size = sc.nextInt();
		int arr[][] = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("Index value of " + i + "," + j + ":    ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Matrix of array :");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("Smallest Element in the column :");
		for (int i = 0; i < size; i++) {
			int x = arr[0][i];
			for (int j = 0; j < size; j++) {
				if (x > arr[i][j]) {
					x = arr[j][i];
				}

			}
			System.out.print(x + " ");

		}
	}
}
