package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class PrintValuesinStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//if we do not give any  datatypes we can add different data types
		//but if we give specific datatypes we can add only given data types
		//if we add another datas it will give error
		Stack<Integer> s = new Stack<>();
		System.out.println("Enter The N :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The Value :");
			int val=sc.nextInt();
			s.push(val);
		}
		System.out.println(s);
		
	}
}
