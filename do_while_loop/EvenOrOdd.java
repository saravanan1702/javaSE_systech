package do_while_loop;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int start,end;
    System.out.println("Enter The Starting Number :");
    start=sc.nextInt();
    System.out.println("Enter The Ending Number :");
    end=sc.nextInt();
    do {
    	if(start%2==0) {
    		System.out.println("The Number is Even");
    	}
    	else {
    		System.out.println("The Number is Odd");
    	}
    
    	start=start+1;
	}while(start<=end);
    
}
}