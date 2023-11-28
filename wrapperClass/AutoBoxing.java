package wrapperClass;

import java.util.Scanner;

public class AutoBoxing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value :");
		int n=sc.nextInt();
		//creating primitive date types into object 
		Integer m=Integer.valueOf(n);
		System.out.println("Autoboxing :"+n);

	}

}
