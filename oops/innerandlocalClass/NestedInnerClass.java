package oops.innerandlocalClass;

class Outer3 {
	static int data = 20;

	static class Inner {
		void meg() {
			System.out.println("Data is :" + data);
		}
	}
}

public class NestedInnerClass {
	public static void main(String[] args) {
      Outer3.Inner i=new Outer3.Inner();
      i.meg();
	}
}
