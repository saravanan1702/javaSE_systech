package oops.tasks;

import java.util.Scanner;

class circle{
	int r;
	void area() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Radious value :");
		r=s.nextInt();
		int areaofCircle=2*(int)Math.PI*r;
		System.out.println("Area of Circumfance :"+areaofCircle);
	}
}
public class CircleTask {
	public static void main(String[] args) {
      circle c=new circle();
      c.area();
	}
}
