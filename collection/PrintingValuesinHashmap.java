package collection;

import java.util.HashMap;

public class PrintingValuesinHashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> a = new HashMap<>();
		a.put(1, "Saravanan");
		a.put(2, "Jasmine");
		a.put(3, "Meena");
		a.put(4, "Yamini");
		a.put(5, "varasha");
		System.out.println(a);
		// removing particular keys
		System.out.println("Remove in particular key");
		a.remove(2);
		System.out.println("now Result ");
		System.out.println(a);
		// adding(update) keys and values
		a.put(2, "dora");
		System.out.println(a);
		// update keys and values
		a.put(2, "Lara");// previously that hashmap has 2, dora;
		System.out.println(a);
		// printing keys only
		System.out.print("Only Keys :" + a.keySet() + " ");
		// printing only values
		System.out.println("printing only values");
		for (Integer x : a.keySet()) {
			System.out.print(a.get(x) + " ");
		}
		

	}
}
