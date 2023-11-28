package do_while_loop;

import java.util.Scanner;

public class Reversef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter N numbers :");
		n = sc.nextInt();
		int i = n;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
	}
}
