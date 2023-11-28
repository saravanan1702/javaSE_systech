package queueandSet;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class NavigableTree {
	public static void main(String[] args) {
		NavigableSet<Integer> s = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value :");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The value :");
			int val = sc.nextInt();
			s.add(val);
		}
		System.out.println("TreeSet is :"+s);
		int start1=s.first();
		System.out.println("First Number is :"+start1);
		int lastn=s.last();
		System.out.println("Last Number is :"+lastn);
		int number1=s.pollFirst();//remove first element in treeset
		System.out.println("Removed First Element :"+number1);
		int number2=s.pollLast();
		System.out.println("Removed Last Element :"+number2);
		System.out.println("After Treeset is :"+s);
	}
}
