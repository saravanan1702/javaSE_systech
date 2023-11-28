package conditional_nested_if;

import java.util.Scanner;

public class Single_Two_Three_Four_digits {

	public static void main(String[] args) {
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Value :");
		x = s.nextInt();
		if (x >= 0 && x <= 9) {
			System.out.println("Single Digits");
		} else if (x >= 10 && x <= 99) {
			System.out.println("Two Digit Number");
		} else if (x >= 100 && x <= 999) {
			System.out.println("Three Digit Number ");
		} else if (x >= 1000 && x <= 9999) {
			System.out.println("four Digits");
		} else {
			System.out.println("Error");
		}

	}

}
