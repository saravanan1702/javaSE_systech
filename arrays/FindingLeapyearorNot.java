package arrays;

import java.util.Scanner;

public class FindingLeapyearorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter the Year a[" + i + "]" + "a[" + j + "]");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 4 == 0) {
					System.out.println(a[i][j] + " is Leap year ");
				} else {
					System.out.println(a[i][j] + " is not Leap Year ");
				}
			}
		}
	}
}
