package conditional_nested_if;

import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int a;
      System.out.println("Enter The Value :");
      a=s.nextInt();
      if(a>0) {
    	  System.out.println("Positive");
      }
      else if(a<0) {
    	  System.out.println("Negative");
      }
      else {
    	  System.out.println("Zero");
      }
	}

}
