package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountingParticularNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t, c = 0;
		System.out.println("Enter the n value :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Value :");
			a[i] = sc.nextInt();

		}
		System.out.println(" Array is : ");
		System.out.println(Arrays.toString(a));
		System.out.println("Enter Finding Particular Number :");
		t = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (a[i] == t) {
				c++;
			}
		}
		System.out.println("Number count is :" + c);
	}
}
