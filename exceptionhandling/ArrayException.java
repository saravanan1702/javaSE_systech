package exceptionhandling;

public class ArrayException {
	public static void main(String[] args) {
		int[] a = new int[6];
		int i=a[6];//values not assigned and not lenth of array if array is 6 the i would be 0 to 5 not in 6th index
		/*
		 * a[0]=1; a[1]=1; a[2]=1; a[3]=90; a[4]=1; a[5]=10; int i = a[3];//length of
		 * array would be 6
		 */		System.out.println("Array is :" + i);

	}
}
