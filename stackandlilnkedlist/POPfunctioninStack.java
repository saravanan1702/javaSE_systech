package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class POPfunctioninStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The Data :");
			int data=sc.nextInt();
			s.push(data);
		}
		System.out.println("Stack Value is :"+s);
		System.out.println("Enter The Deleting Value :");
		int t=sc.nextInt();
		for(int i=0;i<s.size();i++) {
			if(s.get(i)==t) {
				s.pop();
			}
		}
		System.out.println("Now Stack is :"+s);
	}
}
