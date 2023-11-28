package task;

import java.util.Scanner;

public class Average_Numbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1,n2,n3,n4,n5;
		int avg;
		System.out.println("Enter Average :");
		avg=s.nextInt();
		System.out.println("Enter Numbers :");
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		n4=s.nextInt();
		n5=s.nextInt();
		int sum=n1+n2+n3+n4+n5;
		System.out.println("sum :"+sum);
		System.out.println("Average :"+(sum/avg));
		
	}

}
