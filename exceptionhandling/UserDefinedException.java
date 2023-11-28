package exceptionhandling;

public class UserDefinedException extends Exception {
    private static int pid[]= {1,2,3,4,5};
    private static String Pname[]= {"Mobile","Computer","Tablet","Smart","Watch"};
    private static double price[]= {20000,32000,6000,25700,70000};
    
    UserDefinedException(){
    	
    }
    UserDefinedException(String str){
    	super();
    }
    public static void main(String[]args) throws UserDefinedException{
    	try {
    		System.out.println("PNO"+"\t"+"Product Name"+"\t"+"Price");
    		for(int i=0;i<5;i++) {
    			System.out.println(pid[i]+"\t"+Pname[i]+"\t\t"+price[i]);
    			if(price[i]<4000) {
    				UserDefinedException u=new UserDefinedException("Price is below 4000");
    				   throw u;
    			}
    		}
    	}catch(UserDefinedException u) {
    		u.printStackTrace();
    	}
    }
}
