package looping_Statements;

import java.util.Scanner;

public class Forcube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       int n,sum=0;
       System.out.println("Enter n Number :");
       n=sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   sum+=i*i*i;
    	   
       }
       System.out.println("Squre of N number is :"+sum);
       
	}
}
