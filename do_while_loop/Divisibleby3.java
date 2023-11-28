package do_while_loop;

import java.util.Scanner;

public class Divisibleby3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter The Value :");
		a = sc.nextInt();
		do {
			if (a % 3 == 0) {
				System.out.println(a + " is Divisible by 3");
			} else {
				System.out.println(a + " is Not Divisible by 3");
			}
			System.out.println("Enter the Number :");
			a = sc.nextInt();
		} while (a > 0);//until a greater than 0

	}
}
