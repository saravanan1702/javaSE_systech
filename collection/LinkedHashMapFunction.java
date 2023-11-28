package collection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapFunction {
	public static void main(String[] args) {
       LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The N value :");
       int n=sc.nextInt();
       for(int i=0;i<n;i++) {
    	   System.out.println("Enter The Key :");
    	   int key=sc.nextInt();
    	   System.out.println("Enter The Value :");
    	   String val=sc.next();
    	   lhm.put(key, val);
       }
       System.out.println("Result is :"+lhm);
       System.out.println("Size of Map :"+lhm.size());
       System.out.println("Map is empty or not?"+lhm.isEmpty());
       System.out.println("Enter The value :");
       int x=sc.nextInt();
       System.out.println("Contain Key "+lhm.containsKey(x));
	}
}
