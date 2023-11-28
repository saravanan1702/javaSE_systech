package stackandlilnkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class CreatinglinkedList {
	public static void main(String[] args) {
       LinkedList<String>list=new LinkedList<>();
       list.add("Leo");
       list.add("Jailer");
       list.add("Vidamuyarchi");
       list.add("Indian2");
       list.add("Bahubali");
       list.add("KGF3");
       
       System.out.println(list.get(3));
       Iterator<String>itr=list.iterator();
 //import Iterator class //given datatypes //create refference //create object for list
       while(itr.hasNext()) {  //checking list has values or not if there it will move to inside the print method
    	   System.out.println(itr.next());
       }
       
	}
}
