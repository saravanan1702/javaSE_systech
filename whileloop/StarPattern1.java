package whileloop;

import java.util.Scanner;

public class StarPattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.print("*");
			i += 1;
		}
	}
}
