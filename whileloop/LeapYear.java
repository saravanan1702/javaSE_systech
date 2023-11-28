package whileloop;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int x,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Numbers :");
		n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println("Enter the year :");
			x=sc.nextInt();
			if(x%4==0) {
				System.out.println(x+" is leap year");
			}else {
				System.out.println(x+ "is not a leap year");
			}
			i=i+1;
		}
	}
}
