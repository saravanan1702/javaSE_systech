package oops;

import java.util.Scanner;

class Even {
	int x;

	void evenfun(int m) {
		x = m;
		if (x % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Not Even Number");
		}
	}

}

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value :");
		int n = sc.nextInt();
		Even e = new Even();
		e.evenfun(n);//calling even class method

	}
}
