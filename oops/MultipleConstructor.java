package oops;
class Mconst{
	int m=10,n=20,p;
	Mconst(){
		System.out.println("Non paramterized Constructor");
		m=100;
		n=200;
		System.out.println("Values are "+m+" "+n);
	}
	Mconst(int x,int y){
		System.out.println("Parameterized Constructor");
		m=x;
		n=y;
		System.out.println("Value are "+m+" "+n);
	}
	Mconst(int x,int y,int z){
		System.out.println("Constructor overloading");
		m=x;
		n=y;
		p=z;
		System.out.println("Values are "+m+" "+n+" "+p);
	}
}
public class MultipleConstructor {
	public static void main(String[] args) {
      Mconst m=new Mconst(),m1=new Mconst(11,2),m2=new Mconst(12,3,4);
	}
}
