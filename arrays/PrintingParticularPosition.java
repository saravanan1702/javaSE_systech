package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingParticularPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t;
		System.out.println("Enter The Value of N :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the Index value of =>" + i + " :");
			a[i] = sc.nextInt();
		}
		System.out.println("Array is :");
		System.out.println(Arrays.toString(a));
		System.out.println("Enter The Finding Number  :");
		t = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == t) {
				System.out.println("Element of the Array :" + a[i]);
				System.out.println("position found @ :" + i);
			}
		}
	}
}
