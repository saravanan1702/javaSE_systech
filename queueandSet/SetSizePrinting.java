package queueandSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetSizePrinting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> t = new HashSet<Integer>();
		System.out.println("Enter the N value :");
		int n=sc.nextInt();
		
		//using for loop
		/*
		 * for(int i=0;i<n;i++) { System.out.println("Enter the Value :"); int
		 * val=sc.nextInt(); t.add(val); }
		 */
		
		while(n!=100) {
		      t.add(n);
		      System.out.println("Enter The n value :");
		      n=sc.nextInt();
		}
		System.out.println("HashSet size is :"+t.size());
	}
}
