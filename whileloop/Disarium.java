package whileloop;

import java.util.Scanner;

public class Disarium {
	public static void main(String[] args) {
		int a, b, d, count = 0, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		a = sc.nextInt();

		d = 0;
		b = a;// a given values
		t = a;// storing a values for count the calculate
		while (a != 0) {
			a /= 10;
			count = count + 1;

		}
		while (t != 0) {
			int temp = 1;// why 1 =>if we assign zero anything multiple by o will be zero
			int r = t % 10;
			for (int p = 0; p < count; p++) {
				temp = temp * r;
			}
			d = d + temp;
			t /= 10;
			count--;
		}
		if (b == d) {
			System.out.println("Disarium Number ");
		} else {
			System.out.println("Not Disarium Number");
		}
	}
}
