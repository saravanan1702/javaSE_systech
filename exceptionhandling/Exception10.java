package exceptionhandling;

public class Exception10 {
	public static void main(String[] args) {
      try {
    	  int a[]=new int[6];
    	  int i=a[6];
    	  System.out.println("Array is :"+i);
      }catch(ArrayIndexOutOfBoundsException ar) {
    	  System.err.println("Error :"+ar);
//    	  System.err.println("Hello");er =>stands for error it will indicate red color in console
      }
	}
}
