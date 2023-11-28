package stackandlilnkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteParticularValues {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer>list=new LinkedList<Integer>();
		System.out.println("Enter The n value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The Data :");
			int data=sc.nextInt();
			list.add(data);
		}
		System.out.println("Stack is :"+list);
		System.out.println("Enter The Deleting Value :");
		int t=sc.nextInt();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==t) {
				list.remove(i);//that met position will delete
			}
		}
		System.out.println("Linked list after deletion :"+list);
	}
}
