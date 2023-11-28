package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class FindingValuesinStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter The N value :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	System.out.println("Enter The Data :");
        	int val=sc.nextInt();
        	s.push(val);
        }
        System.out.println("the Stack is :"+s);
        System.out.println("Enter the finding value :");
        int find=sc.nextInt();
        for(int i=0;i<s.size();i++) {
        	if(s.get(i)==find) {
        	
        		System.out.println("Value Present at :"+i);
        	}
        }
	}
}
