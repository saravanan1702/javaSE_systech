package looping_Statements;

import java.util.Scanner;

public class SumPositive {
	public static void main(String[] args) {
		int ps = 0, ns = 0, n, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N Number :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the Value :");
			a=sc.nextInt();
			if(a>0) {
				ps=ps+a;
			}else {
				ns=ns-a;
			}
		}
		System.out.println("Positive sum is :"+ps);
		System.out.println("Negative Sum is :"+-(ns));
		
	}
}
