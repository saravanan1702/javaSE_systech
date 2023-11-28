package queueandSet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveParticularvalue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The value :");
			int x=sc.nextInt();
			q.add(x);
		}
		System.out.println("Before Removable Top value is :"+q.peek());
		System.out.println("The queue is :"+q);
		int y=q.remove();
		System.out.println("Queue after Remove :"+q);
		System.out.println("Top value is :"+q.peek());
	}
}
