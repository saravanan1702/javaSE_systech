package switchStatement;

import java.util.Scanner;

public class Sum_of_Square {
	public static void main(String[] args) {
       int a,opt;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter The Value :");
       a=s.nextInt();
       System.out.println("Enter The any one option : 1 or 2");
       opt=s.nextInt();
       switch(opt) {
       case 1:
    	   System.out.println("Even Operators");
    	   if((a%2==0)) {
    		   System.out.println("even Number ");
    	   }
    	   else {
    		   System.out.println("odd Number ");
    	   }
    	   break;
       case 2:
    	   System.out.println("Divisible by 3");
    	   if((a%3==0)) {
    		   System.out.println("Divisible by 3");
    	   }else {
    		   System.out.println("Not Divisible by 3");
    	   }
    	   break;
    	   
      default :
    	  System.out.println("Error");
    	  break;
       }
	}
}
