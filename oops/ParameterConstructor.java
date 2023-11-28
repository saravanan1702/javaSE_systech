package oops;
class Big{
	int x,y;
	void bigfn(int a,int b) {
		x=a;
		y=b;
		if(x>y) {
			System.out.println(x+" First value is big ");
		}
		else {
			System.out.println(y+" Second Value is Big");
		}
	}
}
public class ParameterConstructor {
	public static void main(String[] args) {
     Big b=new Big();
     b.bigfn(12, 3);
	}
}
