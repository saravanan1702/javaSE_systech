package conditional_nested_if;

import java.util.Scanner;

public class Profit_and_Loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int actual,sale;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Actual Amount:");
      actual=s.nextInt();
      System.out.println("Enter Sale Amount :");
      sale=s.nextInt();
      if(sale>actual) {
    	  System.out.println("Profit");
      }else {
    	  System.out.println("Loss");
      }
	}

}
