package queueandSet;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetinSet{
	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The value :");
			int val=sc.nextInt();
			s.add(val);
		}
		System.out.println("Treeset is :"+s);
		int start1=s.first();
		System.out.println("First Number is :"+start1);
		int lastn=s.last();
		System.out.println("Last Number :"+lastn);
	}
}
