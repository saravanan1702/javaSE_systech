package stackandlilnkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class ParticularIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer>list=new LinkedList<>();
		System.out.println("Enter the n value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The data :");
			int val=sc.nextInt();
			list.add(val);
		}
		System.out.println("Stack Value is :"+list);
		System.out.println("Entr The finding value  of Index ");
		int index=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(list.get(i)==index) {
				System.out.println("Index is :"+i);//getting particular value index
			}
		}
	}
}
