package methods;

import java.util.Scanner;

public class EvenOrOdd {
	static void even(int x[]) {
		System.out.println("Result is :");
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0) {
				System.out.println(x[i]+" is Even");
			}else {
				System.out.println(x[i]+" is odd");
			}
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N number :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		even(a);
	}
}
