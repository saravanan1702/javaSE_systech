package arrays;

import java.util.Scanner;

public class PositveAndNegativeCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, pc = 0, nc = 0;
		System.out.println("Enter The Value of N :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The value of Index :");
			a[i] = sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				pc=pc+1;
			}
			else {
				nc=nc+1;
			}
		}
		System.out.println("Positive Count is :"+pc);
		System.out.println("Negative Count is :"+nc);
	}
}
