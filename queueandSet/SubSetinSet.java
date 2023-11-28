package queueandSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubSetinSet {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The value :");
			int val=sc.nextInt();
			s.add(val);
		}
		Set<Integer>s1=new HashSet<Integer>();
		System.out.println("Enter The N value :");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value :");
			int val=sc.nextInt();
			s1.add(val);
			
		}
		System.out.println("HashSet 1 is :"+s);
		System.out.println("HashSet 2 is :"+s1);
	    boolean result =s.containsAll(s1);
	    if(result) {
	    	System.out.println("Set 2 is subset of set 1");
	    }else {
	    	System.out.println("Set 2 is not subset of set1");
	    }
		
	
	}
}
