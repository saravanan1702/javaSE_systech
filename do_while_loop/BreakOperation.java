package do_while_loop;

import java.util.Scanner;

public class BreakOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, k;
		System.out.println("Enter the Starting Value :");
		start = sc.nextInt();
		System.out.println("Enter the Ending value :");
		end = sc.nextInt();
		System.out.println("Enter Searching Value :");
		k = sc.nextInt();
		int i = start;
		do {
			if (i == k) {
				break;
			}
			
			System.out.println(i);
			i++;
		} while (i <= end);
	}
}
