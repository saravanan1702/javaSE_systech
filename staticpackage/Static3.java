package staticpackage;

import static java.lang.Math.*;
//if we import as static we don't need to create object for prefix 
//Example Math.sqrt();
//Math.pow();

public class Static3 {
	public static void main(String[] args) {
		System.out.println(sqrt(4));
		System.out.println(pow(3, 2));
	}

}
