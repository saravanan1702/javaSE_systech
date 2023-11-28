package looptask;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number you want to crate multiple table :");
		n=sc.nextInt();
		System.out.println("Enter table number you want to calculate");
		int t=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i+" x "+n+"="+(i*t));
		}
	}

}
