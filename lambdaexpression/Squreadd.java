package lambdaexpression;

import java.util.Scanner;

interface addable {
	int squre(int a);
	
}

public class Squreadd {
	public static void main(String[] args) {
		addable ad2=(int a)->{
			return (a*a);
		};
	    
		int n, a, m = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter the Number :");
			a = sc.nextInt();
			int d = ad2.squre(a);
			m = m + d;
		}
		System.out.println(m);
	}
}
