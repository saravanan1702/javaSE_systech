package looping_Statements;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		int start, end, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting value :");
		start = sc.nextInt();
		System.out.println("Enter Ending value :");
		end = sc.nextInt();
		System.out.println("Searching value :");
		k = sc.nextInt();
		for (int i = start; i <= end; i++) {
			if (i == k) {
				continue;
			}
			System.out.println(i);
		}
	}
}
