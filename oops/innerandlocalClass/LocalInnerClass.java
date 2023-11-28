package oops.innerandlocalClass;

public class LocalInnerClass {
	private int data = 20;
	
    //local inner class =>which means we create class Inside the method
	private void display() {
		class InnerLocal {
			void msg() {
				System.out.println("Data is :" + data);
			}
		}
		InnerLocal l = new InnerLocal();
		l.msg();
	}
	public static void main(String[] args) {
        LocalInnerClass l=new LocalInnerClass();
        l.display();
        System.out.println("Outer class Data is :"+l.data);
        
	}
}
