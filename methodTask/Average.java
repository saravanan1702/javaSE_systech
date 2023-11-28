package methodTask;

import java.util.Scanner;

public class Average {
	static void average() {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter The 3 number :");
		int n=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		float avg=(n+n2+n3)/3;
		System.out.println("Average of three Number is :"+avg);
	}
	public static void main(String[] args) {
		average();
		
	}

}
