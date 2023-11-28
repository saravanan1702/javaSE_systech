package do_while_task;

import java.util.Scanner;

public class Dividedby3 {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter The number :");
      n=sc.nextInt();
      int i=1;
      do {
    	  if(i%3==0) {
    		  System.out.println(i+ " Divided by 3");
    	  }
    	  else {
    		  System.out.println(i+" not divided by 3");
    	  }
    	  i++;
      }while(i<=n);
	}
}
