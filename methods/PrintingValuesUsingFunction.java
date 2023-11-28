package methods;

import java.util.Scanner;

public class PrintingValuesUsingFunction {
	static int[]printing(int n){
		int x[]=new int[n];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			
		}
		return x;
	}
	static void display(int m[]) {
		System.out.println("Result is :");
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i]+" ");
		}
	}
	public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The N number :");
      n=sc.nextInt();
      int a[]=new int[n];
      a=printing(n);
      display(a);
	}
}
