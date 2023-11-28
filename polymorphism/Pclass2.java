package polymorphism;
class Arith{
	public void calc() {
		
	}
}
class Add extends Arith{
	public void calc() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("total :"+c);
	}
}
class Sub extends Arith{
	public void calc() {
		float a=90.2f,b=23.2f;
		float c=a-b;
		System.out.println("Substraction :"+c);
	}
}
public class Pclass2 {
	public static void main(String[] args) {
     Arith a=new Arith();
     a=new Sub();
     a.calc();
	}
}
