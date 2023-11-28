package integerLearn;

public class Variables {

	public static void main(String[] args) {
		 //integer
		   int data=100;  //Local variable access only inside the class
		   int data1=50;
		   System.out.println("int :"+data);
		   System.out.println("int :"+data1);
		  //float
		  float x1=24.5f;
		  float x2=50.f;
		  System.out.println("float:"+x1);
		  System.out.println("float:"+x2);
		  //char 
		  char m='a';
		  System.out.println("char: "+m);
		  //String concat
		  String x="Program";
		  
		 System.out.println("Java"+x);
		 //concat with store in another varible
		 String str="java";
		 String str1="programming";
		 String z=str+str1;
		 System.out.println(z);
//     giving all variable names and values single line
		 int a=20,b=30,c=40;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
//	    float
		 float a1,b1,c1;
		 a1=b1=c1=6.65f;
		 System.out.println(a1);
		 System.out.println(b1);
		 System.out.println(c1);
//		 finding values's data types
		 int val=1000;
		 System.out.println("value :"+val);
		 System.out.println(val+"-"+((Object)val).getClass().getSimpleName());
		 
		 
		
		 
		  

	}

}
