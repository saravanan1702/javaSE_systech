package whileloop;

import java.util.Scanner;

public class PrintingValuesUntill200 {
	public static void main(String[] args) {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Value :");
      a=sc.nextInt();
      while(a!=200) {
    	  System.out.println("The value is :"+a);
    	  System.out.println("Enter The value :");
    	  a=sc.nextInt();
      }
	}
}
