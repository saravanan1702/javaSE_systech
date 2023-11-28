package oops.innerandlocalClass;
interface person{
	void eat();
	
}
public class AnnoymousClassExample {
	public static void main(String[] args) {
       person p=new person() {
    	   //override
    	   public void eat() {
    		   System.out.println("I'm Eating ");
    	   }
       };
       p.eat();//calling this method
	}
}
