package exceptionhandling;

public class Exception2 {
	public static void main(String[] args) {
      try {
    	  int a=10;
    	  int c=a/0;
    	  System.out.println(c);
      }catch(Exception e) {
    	  System.out.println("Error"+e);
      }
      System.out.println("Completed");
	}
}
