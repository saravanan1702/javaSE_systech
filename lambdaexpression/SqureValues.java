package lambdaexpression;
interface  SquareofNumber{
	int Square(int a);
}
public class SqureValues {
	public static void main(String[] args) {
     SquareofNumber s=(int a)->{
    	 return (a*2);
    	 
     };
     System.out.println(s.Square(12));
     System.out.println(s.Square(23));
	}
}
