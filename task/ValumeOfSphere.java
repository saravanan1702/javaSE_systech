package task;

import java.util.Scanner;

public class ValumeOfSphere {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float r;
		System.out.println("Enter the Radious :");
		r=sc.nextFloat();
		float valume=4/3*3.14f*r;
		System.out.println("Valume of Sphere is :"+valume);

	}

}
