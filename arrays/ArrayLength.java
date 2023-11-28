package arrays;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 100, 200, 300, 400 };
		System.out.println("The Array Values :");
		for (int i = 0; i < a.length; i++) {
			System.out.print("[" + a[i] + "]" + " ");
		}
	}
}
