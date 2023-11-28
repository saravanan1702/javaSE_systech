package oops.inheritance;
class Base2{
	int x=100;
	int y=200;
	int z=0;
	void add() {
		z=x+y;
		System.out.println("Sum of Two Number is :"+z);
	}
}
public class Adding extends Base2 {
	public static void main(String[] args) {
   Adding add=new Adding();
   add.add();
	}
}
