package queueandSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterSectioninSet {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value :");
			int val=sc.nextInt();
			s.add(val);
		}
		System.out.println("HashSet 1 is :"+s);
		Set<Integer>s1=new HashSet<Integer>();
		System.out.println("Enter The N value :");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++) {
			System.out.println("Enter The value :");
			int val=sc.nextInt();
			s1.add(val);
		}
		System.out.println("HashSet 2 is :"+s1);
		s.retainAll(s1);//common values for both
		System.out.println("InterSection of 2 set is "+s);
	}
}
