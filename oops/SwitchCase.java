package oops;

import java.util.Scanner;

class Swcase {
    void oper(int x,int y,int z) {
    	int result ;
    	switch(z) {
    	case 1:
    		result=x+y;
    		System.out.println("Result is :"+result);
    		break;
    	case 2:
    		result=x-y;
    		System.out.println("Result is :"+result);
    		break;
    	case 3:
    		result =x*y;
    		System.out.println("Result is :"+result);
    		break;
    	case 4:
    		result =x/y;
    		System.out.println("Result is :"+result);
    		break;
    		
        default:
        	System.out.println("Invalid option");
    	}
    }
}

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Value :");
		int a=sc.nextInt();
		System.out.println("Enter The Second Value :");
		int b=sc.nextInt();
		System.out.println("Enter the number 1 to 4 :");
		int c=sc.nextInt();
		Swcase s=new Swcase();
		s.oper(a, b, c);
		
	}
}
