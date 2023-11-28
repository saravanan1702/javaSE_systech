package collection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FindValuesiNlinkedHashmap {
	public static void main(String[] args) {
		int n, key;
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Key :");
			key = sc.nextInt();
			System.out.println("Enter The Value :");
			String Val = sc.next();
			lhm.put(key, Val);
		}
		System.out.println("Linked HashMap is :"+lhm);
        System.out.println("Enter The Particular key value :");
        int x=sc.nextInt();//key
        for(Integer find:lhm.keySet()) { //travarsing entire array with for each loop
        	if(find==x) {
        		System.out.println(lhm.get(find)+" Available");
        	}
        }
	}
}
