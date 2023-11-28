package arrays;

import java.util.Scanner;

public class EvenorOddCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, ec = 0, oc = 0;
		System.out.println("Enter the N number :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Value :");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				ec++;
			} else {
				oc++;
			}
		}
		System.out.println("Even Count  is:" + ec);
		System.out.println("Odd Count is :" + oc);
	}
}
