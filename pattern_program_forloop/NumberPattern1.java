package pattern_program_forloop;

import java.util.Scanner;

public class NumberPattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the Number :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
