package do_while_loop;

import java.util.Scanner;

public class SumofSqure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, x;
		System.out.println("Enter the N nuber :");
		n = sc.nextInt();
		int i = 1;
		do {
			x = i * i;
			sum += x;
			i = i + 1;
		} while (i <= n);
		System.out.println("sum of Squre is :" + sum);
	}
}
