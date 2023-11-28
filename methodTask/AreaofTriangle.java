package methodTask;

import java.util.Scanner;

public class AreaofTriangle {
	static float area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The three side of Triangle value :");
		float s1=sc.nextFloat();
		float s2=sc.nextFloat();
		float s3=sc.nextFloat();
		float s=(s1+s2+s3)/2;
		return (float) Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		
		
	}

	

	public static void main(String[] args) {
		System.out.println("Area of Trianlge is :"+area());

	}
}
