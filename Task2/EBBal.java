package Task2;

import java.util.Scanner;

public class EBBal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,d;
		System.out.println("Current Reading :");
		a=s.nextInt();
		System.out.println("previous Reading :");
		b=s.nextInt();
		d=a-b;
		int unit =8;
		float total=d*unit;
		System.out.println("total Using Unit :"+d);
		System.out.println("total Unit Price  :"+total);
		

	}

}
