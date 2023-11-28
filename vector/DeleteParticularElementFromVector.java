package vector;

import java.util.Scanner;
import java.util.Vector;

public class DeleteParticularElementFromVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The n:");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println("Enter The Value :");
			int m = sc.nextInt();
			v.add(m);
			i++;
		}
		System.out.println("Vector Value :" + v);
		System.out.println();
		System.out.println("Enter The Particular Value :");
		int w = sc.nextInt();
		for (int q = 0; q < v.size(); q++) {
			if (v.get(q) == w) {
				v.remove(q);
			}
		}
		System.out.println("Latest Vector Value :" + v);
	}
}
