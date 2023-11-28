package collection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ChangingValueLinkedHashMap {
	public static void main(String[] args) {
       int n;
       LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The n value :");
       n=sc.nextInt();
       for(int i=0;i<n;i++) {
    	   System.out.println("Enter The key :");
    	   String key=sc.next();
    	   System.out.println("Enter The value :");
    	   int age=sc.nextInt();
    	   lhm.put(key, age);
       }
       //while update keys and values in linked list if there particular 
       //key and values there in linked hashmap it will update new one(override)
       //or it will add new key and values in linked hashmap 
       System.out.println("Result :"+lhm);
       System.out.println("Enter The Particular key value :");
       String x=sc.next();
       System.out.println("Enter The Chaning Value :");
       int y=sc.nextInt();
       lhm.put(x,y);//String(x),Integer(y);//update method overraid old values and keys
       System.out.println("Updated Result is :"+lhm);
	}
}
