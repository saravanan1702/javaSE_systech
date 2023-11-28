package whileloop;

import java.util.Scanner;

public class BreakProgram {
	public static void main(String[] args) {
		int start, end, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Value :");
		start = sc.nextInt();
		System.out.println("Enter Ending Value :");
		end = sc.nextInt();
		System.out.println("Enter Searching Value :");
		k = sc.nextInt();
		int i = start;// initialize starting value;
		while (i <= end) {
			if (i == k) {
				break;// if condition is meet then it will break the statement
			}
			System.out.println(i);
			i = i + 1;
		}
	}
}
