package arrays;

import java.util.Scanner;

public class ArrayReverseUsingWhileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n values :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i = arr.length - 1;
		while (i >=0) {
			System.out.println("Enter the Element of a["+i+"] :");
			arr[i]=sc.nextInt();
			i = i - 1;
		}
		//after reverse
		System.out.println("After Reverse Order :");
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}
}
