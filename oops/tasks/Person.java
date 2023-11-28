package oops.tasks;
class Person1{
	String name;
	int age;
	Person1(String n,int a){
		name=n;
		age=a;
	}
	void display() {
		System.out.println("name :"+name+" \n"+"Age :"+age);
	}
}
public class Person {
	public static void main(String[] args) {
     Person1 p=new Person1("Jasmine",24);
     p.display();
	}
}
