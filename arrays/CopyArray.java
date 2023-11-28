package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Ente The N number :");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter The Index of :" + i);
			a[i] = sc.nextInt();
		}
		System.out.println("Result is :");
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("Array of A is :"+Arrays.toString(a));
		System.out.println("Array of B is :"+Arrays.toString(b));

	}
}
