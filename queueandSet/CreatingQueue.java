package queueandSet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreatingQueue {
	public static void main(String[] args) {
       Queue<Integer>q=new LinkedList<>();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The n :");
       int n=sc.nextInt();
       for(int i=0;i<n;i++) {
    	   q.add(i);
       }
       System.out.println("Queue is Q :"+q);
	}
}
