package serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentRecordDemo2 implements Serializable{
	public String stdName;
	public String stdAddress;
	public int stdId;

	public static void main(String[] args) {
     StudentRecordDemo2 s=new StudentRecordDemo2();
     s.stdName="saravanan";
     s.stdAddress="Trichy,KK Nagar";
     s.stdId=2;
     
     try {
    	 FileOutputStream fileout=new FileOutputStream("s.txt");
    	 ObjectOutputStream out=new ObjectOutputStream(fileout);
    	 out.writeObject(s);
    	 out.close();
    	 fileout.close();
    	 System.out.println("Object Serialized and saved in s.txt");
    	 FileInputStream filein=new FileInputStream("s.txt");
    	 ObjectInputStream in=new ObjectInputStream(filein);
    	 s=(StudentRecordDemo2) in.readObject();
    	 in.close();
    	 filein.close();
    	 
    	 
     }
     catch(IOException i){
    	 i.printStackTrace();
     }
     catch(ClassNotFoundException c){
    	 System.out.println("Student class not found");
    	 c.printStackTrace();
    	 return;
     }
     
     System.out.println("\nDeserialized Student");
     System.out.println("Name :"+s.stdName);
     System.out.println("Address :"+s.stdAddress);
     System.out.println("Id :"+s.stdId);
	}
}
