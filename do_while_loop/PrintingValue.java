package do_while_loop;

import java.util.Scanner;

public class PrintingValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N number :");
		n = sc.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i += 1;
		} while (i <= n);
	}
}
