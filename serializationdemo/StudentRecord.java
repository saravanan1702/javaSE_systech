package serializationdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentRecord implements java.io.Serializable {
	public String std_Name;
	public String std_Addr;
	public int stud_Id;

	public static void main(String[] args) {
		StudentRecord sr = new StudentRecord();
		sr.std_Name = "Saravanan";
		sr.std_Addr = "Trichy,K.K Nagar";
		sr.stud_Id = 1;

		try {
			FileOutputStream fileout = new FileOutputStream("s.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(sr);
			out.close();
			fileout.close();
			System.out.println("Object Serialized and saved in s.txt");
		}
		catch (IOException i) {
			i.printStackTrace();
		}
	}
}
