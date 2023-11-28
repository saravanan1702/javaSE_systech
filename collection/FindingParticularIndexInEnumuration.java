package collection;

import java.util.Scanner;
import java.util.Enumeration;
import java.util.Vector;
// counting particular values in enumuration
public class FindingParticularIndexInEnumuration {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		int h=0;
		Enumeration data;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The N :");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			String s=sc.next();
			v.add(s);
			i++;
		}
		data=v.elements();
		System.out.println("Enter The Particular Word :");
		String s=sc.next();
		while(data.hasMoreElements()) {
			if(s.equals(data.nextElement())) {
				h+=1;
			}
		}
		System.out.println("Count of "+s+" is "+h);
	}
}
