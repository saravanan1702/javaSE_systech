package InputFromKeyboard;
import java.util.Scanner;
public class Java {
 public static void main(String []args) {
//	 getting integer values 
	 int x;
	 System.out.println("Enter The Value of x :");
	 Scanner s=new Scanner(System.in);
	 x=s.nextInt();
	 System.out.println("The values of x is :");
	 System.out.println(x);
//	 getting float values 
	 float b;
	 System.out.println("Enter the Values of B :");
	 Scanner s1=new Scanner(System.in);
	 b=s1.nextFloat();
	 System.out.println("The Values of B is :");
	 System.out.println(b);
//	 Getting String As input
	 String str;
	 System.out.println("Enter The Name :");
	 Scanner s2=new Scanner(System.in);
	 str=s2.next();
	 System.out.println("Your Name is :");
	 System.out.println(str);
 }
}
