package oops.inheritance;

import java.util.Scanner;

public class PubllicExample extends Publlic_Variable {
	public PubllicExample(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Value :");
		int n1=sc.nextInt();
		System.out.println("Enter The Second Value :");
		int n2=sc.nextInt();
		PubllicExample ex=new PubllicExample(n1,n2);
		ex.add();
		ex.sub();
		ex.rect();
		ex.squre();

	}
}
