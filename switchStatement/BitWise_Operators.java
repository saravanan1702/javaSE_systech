package switchStatement;

import java.util.Scanner;

public class BitWise_Operators {
	public static void main(String[] args) {
     int a,b,c,opt;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter The First Value :");
     a=s.nextInt();
     System.out.println("Enter The second value :");
     b=s.nextInt();
     System.out.println("Enter the any one operation 1 or 2 or 3 or 4");
     opt=s.nextInt();
     switch(opt) {
     case 1:
    	 c=a%b;
    	 System.out.println("Bitwise AND operation is :"+c);
    	 break;
     case 2:
    	 c=a|b;
    	 System.out.println("Bitwise OR Operation is :"+c);
    	 break;
     case 3:
    	 c=~a;
    	 System.out.println("Bitwise NOT Operation :"+c);
    	 break;
     case 4:
    	 c=a^b;
    	 System.out.println("Bitwise XOR Operation is :"+c);
    	 break;
    default :
    	System.out.println("Error");
    	break;
     }
	}
}
