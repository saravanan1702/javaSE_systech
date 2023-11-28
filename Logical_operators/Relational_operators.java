package Logical_operators;

import java.util.Scanner; //ctrl+shift+o

public class Relational_operators {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int x,y,z;
       System.out.println("Enter The value of x:");
       x=s.nextInt();
       System.out.println("Enter the values of y:");
       y=s.nextInt();
       System.out.println("Result :"+(x==y));
       System.out.println("Result :"+(x!=y));
       System.out.println("Result :"+(x<y));
       System.out.println("Result :"+(x>y));
       System.out.println("Result :"+(x<=y));
       System.out.println("Result :"+(x>=y));
	}

}
