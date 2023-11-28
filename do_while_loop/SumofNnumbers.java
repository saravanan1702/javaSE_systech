package do_while_loop;

import java.util.Scanner;

public class SumofNnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		System.out.println("Enter the Number :");
		n = sc.nextInt();
		int i = 1;
		do {
			sum += i;
			i = i + 1;
		} while (i <= n);
		System.out.println("Sum of N number :" + sum);
	}
}
