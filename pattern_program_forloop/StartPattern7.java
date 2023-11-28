package pattern_program_forloop;

import java.util.Scanner;

public class StartPattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The Numbers :");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i+1; j++) {
//				System.out.print(" ");
//			}
//			for (int k = i; k <= n-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
