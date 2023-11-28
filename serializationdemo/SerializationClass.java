package serializationdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.name = "ADMIN";
		emp.salary = 20000;
		emp.Address = "Trichy";
		try {
			FileOutputStream fos = new FileOutputStream("Char.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(emp);
			out.close();
			fos.close();
			System.out.println("Serialization data is Saved in Char.txt file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
