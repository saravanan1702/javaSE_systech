package task;

import java.util.Scanner;

public class Petrol_fuel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float amount;
		float petrol_price ;
		System.out.println("Enter the amount you want to spend fuel :");
		amount=s.nextInt();
		System.out.println("Enter the Fuel Price of today :");
		petrol_price=s.nextInt();
		float litre=amount/petrol_price;
		System.out.println("total Litre :"+litre);
		
		
		
		
	}

}
