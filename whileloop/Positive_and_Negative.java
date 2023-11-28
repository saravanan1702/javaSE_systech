package whileloop;

import java.util.Scanner;

//sum of positive and negative numbers
public class Positive_and_Negative {
	public static void main(String[] args) {
		int a, x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value :");
		a = sc.nextInt();
		while (a != 1000) {
            if(a>0) {
            	x+=a;//x=x+a;
            }
            else {
            	y-=a;//y=y-a;
            }
           System.out.print("Enter The value :");
           a=sc.nextInt();
		}
		System.out.println("Positive sum is :"+x);
		System.out.println("Negative sum is :"+-(y));
	}
}
