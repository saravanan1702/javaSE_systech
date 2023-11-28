package array_execersice;

import java.util.Arrays;

public class SortArrayinString {
	public static void main(String[] args) {
		int a[] = { 12, 4, 68, 3, 55, 5 };
		System.out.println("Array before sort :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after Sort :" + Arrays.toString(a));
	}
}
