package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<>();
		int size,t;
		System.out.println("Enter The size of Arraylist :");
		size=sc.nextInt();
		for(int i=0;i<size;i++) {
			t=sc.nextInt();
			list.add(t);
		}
		System.out.println("Before Reverse :");
		System.out.print(list+" ");
		System.out.println();
		System.out.println("After Reverse :");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		
		
		
	}
}
