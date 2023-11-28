package oops.inheritance.task;
class Vehicle{
	public void drive() {
		System.out.println("Car is now working condition");
	}
}
class Car extends Vehicle{
	public void drive() {
		System.out.println("Repairing a Car");
	}
}
public class Drive{
	public static void main(String[] args) {
		Vehicle v=new Car();
		v.drive();//dynamic dispatch
		
		Car c=new Car();
		c.drive();//methods always depends of object not for a reference

	}
}
