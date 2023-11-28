package whileloop;

import java.util.Scanner;

public class PositiveOrNegativeorZeroCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,x=0,y=0,z=0;
		System.out.println("Enter The Value :");
		a=sc.nextInt();
		while(a!=1000) {
			if(a>0) {
				x+=1;
			}
			else if(a<0) {
				y+=1;
			}
			else {
				z+=1;
			}
			System.out.println("Enter The Value:");
			a=sc.nextInt();
		}
		System.out.println("Positive Count is :"+x);
		System.out.println("Negative Count is :"+y);
		System.out.println("Zero     Count is :"+z);
	}
}
