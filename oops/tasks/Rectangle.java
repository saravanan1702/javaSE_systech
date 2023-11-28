package oops.tasks;
class Rect{
	int l;
	int w;
	
	int area(int a,int b) {
		int areaofRect=a*b;
		return areaofRect;
	}
	int perimeter() {
		//we can get values from user also
		int l=25;
		int w=20;
		return l+w*2;
	}
}
public class Rectangle {
	public static void main(String[] args) {
		Rect r=new Rect();
		
		System.out.println("Area of Rectangle :"+r.area(12, 5));
		System.out.println("Area of Perimeter :"+r.perimeter());

	}
}
