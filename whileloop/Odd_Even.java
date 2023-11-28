package whileloop;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start,end;
		System.out.println("Enter the Starting Number :");
		start=sc.nextInt();
		System.out.println("Enter The Ending Number :");
		end=sc.nextInt();
		while(start<=end) {
			if(start%2==0) {
				System.out.println(start+" is even Number ");
			}else {
				System.out.println(start+" is Odd Number");
			}
			start+=1;//start=start+1;
		}
	}
}
