package oops.innerandlocalClass;

import java.util.Scanner;

class Arith {
	void add() {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The x :");
		x = sc.nextInt();
		System.out.println("Enter the y :");
		y = sc.nextInt();
		z = x + y;
		System.out.println("Addition Value is :" + z);

	}

	static class Subtract {
		void sub() {
			int x, y, z;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the x :");
			x = sc.nextInt();
			System.out.println("Enter the Y :");
			y = sc.nextInt();
			z = x - y;
			System.out.println("Substraction Value is :" + z);
		}
	}
}

public class StaticInnnerExample {
	public static void main(String[] args) {
		//outer class
		Arith a=new Arith();
		a.add();
		//static inner class
    Arith.Subtract s=new Arith.Subtract();
    s.sub();
	}
}
