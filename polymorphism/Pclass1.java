package polymorphism;
class Car{
	public void printing() {
		System.out.println("Four Wheel Vehicle");
	}
}
class Bike{
	public void printing() {
		System.out.println("Two Wheel Vehicle");
	}
}
public class Pclass1 {
	public static void main(String[] args) {
       Car c=new Car();
       Bike b=new Bike();
       c.printing();
       b.printing();
	}
}
