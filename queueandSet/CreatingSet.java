package queueandSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CreatingSet {
	public static void main(String[] args) {
		Set<Integer> t = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value :");
			int val=sc.nextInt();
			t.add(val);
		}
		System.out.println("hashset :"+t);
	}
}
