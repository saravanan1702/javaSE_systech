package do_while_task;

import java.util.Scanner;

public class SqureofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x=0;
		System.out.println("Enter the Number :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			x = i * i;
			i++;
		}
		System.out.println("Squre of N number is :"+x);
	}
}
