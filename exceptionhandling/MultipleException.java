package exceptionhandling;

public class MultipleException {
	public static void main(String[] args) {
      try {
    	  int a=args.length;
    	  System.out.println("a="+a);
    	  int b=10/a;
    	  int c[]= {10};
    	  c[10]=100;
      }catch(ArithmeticException e){
    	  System.out.println("Error :"+e);
      }
      catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println("Array Index Error :"+e);
      }
	}
}
