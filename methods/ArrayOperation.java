package methods;

import java.util.Scanner;

public class ArrayOperation {
	public static void printing(int[]x) {
		System.out.println("Result is :");
		for (int i = 0; i <x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The N number :");
	    n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		printing(array);
	}
}
