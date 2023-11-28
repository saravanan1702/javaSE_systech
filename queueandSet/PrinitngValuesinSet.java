package queueandSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PrinitngValuesinSet {
	public static void main(String[] args) {
		Set<Integer> t = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the N value :");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++) {
	    	System.out.println("Enter The value :");
	    	int x=sc.nextInt();
	    	t.add(x);
	    }
	    Iterator <Integer>itr=t.iterator();
	    System.out.println("HashSet using Iterator :");
	    while(itr.hasNext()) {
	    	System.out.print(itr.next());
	    	System.out.print(",");
	    }
	}
}
