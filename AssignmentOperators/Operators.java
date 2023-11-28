package AssignmentOperators;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
	int x,y,z;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Values of X:");
	x=s.nextInt();
	System.out.println("Enter the Values of Y:");
	y=s.nextInt();
	z=x+y;
	System.out.println("Result :"+z);
	z+=x; //z=z+x;
	System.out.println("Result :"+z);
	z-=x; //z=z-x;
	System.out.println("Result :"+z);
	z*=x; //z=z*x;
	System.out.println("Result :"+z);
	z/=x; //z=z/x;
	System.out.println("Result :"+z);
	z%=x;//z=z%x;
	System.out.println("Result :"+z);
	

	}

}
