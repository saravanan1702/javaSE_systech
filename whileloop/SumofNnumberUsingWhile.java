package whileloop;

import java.util.Scanner;

public class SumofNnumberUsingWhile {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n,sum=0;
     System.out.println("Enter the N number :");
     n=sc.nextInt();
     int i=1;//initialization
     //condition
     while(i<=n){
    	 sum+=i;
    	 i=i+1;
    	 
     }
     System.out.println("sum of N number is: "+sum);
	}
}
