package do_while_loop;

import java.util.Scanner;

public class SqureTheNumber {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a,x;
       System.out.println("Enter the value :");
       a=sc.nextInt();
       do {
    	   x=a*a;
    	   System.out.println("the Square value is :"+x);
    	   System.out.println("Enter the value :");
    	   a=sc.nextInt();
    	 
       }while(a!=500);
	}
}
