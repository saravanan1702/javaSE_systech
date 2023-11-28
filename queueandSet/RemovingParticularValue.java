package queueandSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RemovingParticularValue {
	public static void main(String[] args) {
		Set<Integer> t = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The  N value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The value :");
			int x=sc.nextInt();
			t.add(x);
		}
		System.out.println("HashSet is :"+t);
		System.out.println("Enter The Deleting Value :-----");
		int k=sc.nextInt();
		Iterator<Integer>itr=t.iterator();
		while(itr.hasNext()) {
			if(itr.next()==k) {
				t.remove(k);
				break;
			}
			
		}
		System.out.println("HashSet is :"+t);
	}
}
