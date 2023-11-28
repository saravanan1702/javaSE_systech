package methodTask;

import java.util.Scanner;

public class GivenNumberisEvenorNot {
	static boolean digits(int n) {
		final int f=10;
		if(n==0) {
			return false;
		}
		while(n!=0) {
			if((n%f)%2!=0) {
				return false;
			}
			n/=f;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits :");
		int n=sc.nextInt();
	    boolean t=digits(n);
	    System.out.println(n+" this digits is even ?"+t);
		
	}
}
