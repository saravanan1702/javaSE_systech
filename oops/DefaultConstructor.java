package oops;
class Arithmatic{
	int a=100,b=200;
	public void add() {
		int z=a+b;
		System.out.println("Addition value is :"+z);
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		Arithmatic a=new Arithmatic();//default constructor when we didn't mention any constrcutor it will called automatically we can't see that it wil create internly
		a.add();
  
	}
}
