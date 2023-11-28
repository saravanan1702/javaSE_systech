package oops;
class Stat{
	int idno;
	String name;
	static String Cname="IBM";
	Stat(int x,String y){
		idno=x;
		name=y;
	}
	void display() {
		System.out.println("Roll No :"+idno);
		System.out.println("Name :"+name);
		System.out.println("College Name :"+Cname);
	}
	
}
public class StaticMethod {
	public static void main(String[] args) {
		Stat s=new Stat(1,"Jasmine");
		s.display();
		//we can change the static valus with object
		s.Cname="Google";
		s.display();//it will print 1,Jasmine,Google

	}
}
