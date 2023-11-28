package arrays;

import java.util.Scanner;

public class PrintingValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 100, 200, 300, 400 };
		System.out.println("The Array Value :");
		for (int i = 0; i < 4; i++) {
			System.out.print("["+a[i]+"]" + " ");
		}
	}
}
