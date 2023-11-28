package queueandSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetUnion {
	public static void main(String[] args) {
		Set<Integer> t = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value :");
			int val=sc.nextInt();
			t.add(val);
		}
		System.out.println("HashSet List is :"+t);
		Set<Integer>p=new HashSet<Integer>();
		System.out.println("Enter the N value :");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++) {
			System.out.println("Enter the value :");
			int val1=sc.nextInt();
			p.add(val1);
		}
		System.out.println("HashSet2 is :"+p);
		t.addAll(p);//merging two set into single one
		System.out.println("Union of 2 set is :"+t);

	}
}
