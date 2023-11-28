package vector;

import java.util.Scanner;
import java.util.Vector;

public class printVectorValuesinForEachLoop {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value :");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println("enter the value :");
			Integer m = sc.nextInt();
			v.add(m);
			i++;
		}
		System.out.println("Vector value :");
		for (Integer p : v) {
			System.out.print(p + " ");
		}
	}
}
