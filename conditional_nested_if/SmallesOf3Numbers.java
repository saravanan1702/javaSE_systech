package conditional_nested_if;

import java.util.Scanner;

public class SmallesOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the First Value :");
       a=s.nextInt();
       System.out.println("Enter The Second Value :");
       b=s.nextInt();
       System.out.println("Enter The Third Values :");
       c=s.nextInt();
       if(a<b) {
    	   if(a<c) {
    		   System.out.println("A is small");
    	   }else {
    		   System.out.println("c is small");
    	   }
       }else if(b<c) {
    	   System.out.println("b is small");
       }
       else {
    	   System.out.println("c is small");
       }
	}

}
