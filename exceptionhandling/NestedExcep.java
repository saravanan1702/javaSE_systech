package exceptionhandling;

public class NestedExcep {
	public static void main(String[] args) {
        try {
//        	int a=args.length;
        	int a=2;
        	int b=10/a;
        	System.out.println("a="+a);
        	try {
        		if(a==1)
        			a=a*a;
        		System.out.println("Squre "+a);
        		if(a==2) {
        		int c[]= {100};
        		c[10]=100;
        		}
        	}catch(ArrayIndexOutOfBoundsException e) {
            	System.out.println("Array Index :"+e);
        }
        }catch(ArithmeticException e) {
        	System.out.println("Error :"+e);
        }
	
	}
}
