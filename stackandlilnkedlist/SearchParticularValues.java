package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class SearchParticularValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		System.out.println("Enter The N value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The value :");
			int a=sc.nextInt();
			s.push(a);
		}
		System.out.println("Enter the value is :"+s);
		System.out.println("Find the value :");
		int t=sc.nextInt();
		int k=s.search(t);
		System.out.println(k);
		
		if(k>0) {
			System.out.println("Available");
		}else {
			System.out.println("Not Available");
		}
		
		}
	}

