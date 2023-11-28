package whileloop;

import java.util.Scanner;

public class StarPattern12 {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("Enter The value :");
     n=sc.nextInt();
     int a=1;
     int i=1;
     while(i<=n) {
    	 int j=i;
    	 while(j<=n) {
    		 System.out.print(" ");
    		 j++;
    	 }
    	 int k=1;
    	 while(k<=a) {
    		 System.out.print("*");
    		 k++;
    	 }
    	 System.out.println();
    	 i++;
    	 a+=2;
     }
	}
}
