package do_while_task;

import java.util.Scanner;

public class FactorialofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = 1;
		int n;
		System.out.println("Enter the N value :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			f = f * i;
			i++;
		}
         System.out.println("Factorial of Number is :"+f);
	}
}
