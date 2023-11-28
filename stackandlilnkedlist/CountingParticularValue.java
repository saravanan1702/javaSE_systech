package stackandlilnkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class CountingParticularValue {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter The N value :");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++) {
	    	System.out.println("Enter The Value :");
	    	int val=sc.nextInt();
	    	list.add(val);
	    }
	    System.out.println("Stack Value is :"+list);
	    System.out.println("Enter Finding Value :");
	    int t=sc.nextInt();
	    for(int i=0;i<n;i++) {
	    	if(list.get(i)==t) {
	    		count++;
	    	}
	    }
	    System.out.println("Count is :"+count);
	}
}
