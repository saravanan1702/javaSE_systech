package methods;

import java.util.Scanner;

public class LeapYear {
	static void leap(int a[]) {
		System.out.println("Result is :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 4 == 0) {
				System.out.println(a[i] + " is Leap year");
			} else {
				System.out.println(a[i] + " is Not a Leap Year");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N Number :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter The Index value :" + i);
			a[i] = sc.nextInt();
		}
		leap(a);
	}
}
