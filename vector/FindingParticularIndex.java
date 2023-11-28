package vector;

import java.util.Scanner;
import java.util.Vector;

public class FindingParticularIndex {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n=sc.nextInt();
        int i=1;//initialize
        while(i<=n) { //conditon checker
        	System.out.println("Enter The Value :");
        	int val=sc.nextInt();
        	v.add(val);
        	i++;// operator(increament or decrement)
        }
        System.out.println("Vector Value is :"+v);
        System.out.println("Enter The Particular Value :");
        int x=sc.nextInt();
        for(int y=0;y<v.size();y++) {
        	if(v.get(y)==x){
        		System.out.println("index is :"+y);
        	}
        	
        }
	}
}
