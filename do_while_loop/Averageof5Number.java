package do_while_loop;

import java.util.Scanner;

public class Averageof5Number {
	public static void main(String[] args) {
		int n, x, sum = 0, c = 0;
		float avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N values :");
		n = sc.nextInt();
		int i = 1;
		do {
			System.out.println("Enter the Value :");
			x = sc.nextInt();
			sum = sum + x;
			c = c + 1;
			i += 1;
		} while (i <= n);
		avg = sum / c;
		System.out.println("Average of Number is :" + avg);
	}
}
