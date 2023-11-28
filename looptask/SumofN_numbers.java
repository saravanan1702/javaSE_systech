package looptask;

import java.util.Scanner;

public class SumofN_numbers {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n;
      n=sc.nextInt();
      int sum=0;
      for(int i=1;i<=n;i++) {
    	  sum+=i;
      }
      System.out.println("Sum of N numbers is :"+sum);
	}
}
