package serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp emp = null;
        try {
        	FileInputStream fis=new FileInputStream("Char.txt");
        	ObjectInputStream ois=new ObjectInputStream(fis);
        	emp=(Emp) ois.readObject();
        	fis.close();
        }
        finally
        {
        	System.out.println("Deserialization Employee");
        	System.out.println("First Name of Employee :"+emp.name);
        	System.out.println("Address of Employee :"+emp.Address);
        	System.out.println("Salary of Employee :"+emp.salary);
        }
	}
}
