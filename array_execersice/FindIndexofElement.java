package array_execersice;

import java.util.Scanner;

public class FindIndexofElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element that you want to find :");
		int x = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (a[i]==x) {
				System.out.println("Array found at :" + i);
			} 
		}
	}
}
