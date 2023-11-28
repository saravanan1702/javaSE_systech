package oops.inheritance.task;
class ShapeDemo{
	int length;
	int breadth;
	void getArea() {
		int area=length+breadth;
		System.out.println("Area :"+area);
	}
}
class Rectangle extends ShapeDemo{
	void recarea() {
		int rect=2*super.breadth*super.length;
		System.out.println("Area of Rectangle :"+rect);
		
	}
}
public class Shape {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.breadth=10;
		r.length=20;
		r.getArea();
		r.recarea();
	}
}
