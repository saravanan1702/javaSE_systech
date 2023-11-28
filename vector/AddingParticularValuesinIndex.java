package vector;

import java.util.Scanner;
import java.util.Vector;

public class AddingParticularValuesinIndex {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n = sc.nextInt();
		int i = 0;
		while (i < n) {
			System.out.println("Enter The Value :");
			String t = sc.next();
			v.add(t);
			i += 1;

		}
		System.out.println("Before Removing :"+v);
		//
		
//	Addinng particular values 
//		System.out.println("Vector is :"+v);
//		System.out.println("Enter the Index you want to add the new value :");
//		int index=sc.nextInt();
//		System.out.println("Enter The new Value that you want to add :");
//		String val=sc.next();
//		v.add(index, val);
//		System.out.println("After Adding elements ");
//		for(String x:v) {
//			System.out.println(x);
//		}
		
		//Remove Particular Value 
		System.out.println("Enter the Name you want to Remove");
		String name=sc.next();
		for(int x=0;x<v.size();x++) {
			if(v.get(x)==name) {
				v.remove(name);
			}
		}
		System.out.println("After Revoming Element from Vector :"+v);
	}
}
