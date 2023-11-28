package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class ChangingValuesInStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The Value :");
			int val=sc.nextInt();
			s.push(val);
		}
		System.out.println("Stack value is :"+s);
		System.out.println("Enter The finding value :");
		int find=sc.nextInt();
		System.out.println("Enter The latest value :");
		int newval=sc.nextInt();
		for(int i=0;i<s.size();i++) {
			if(s.get(i)==find) {
				s.set(i, newval);
			}
		}
		System.out.println("Stack is :"+s);
	}
}
