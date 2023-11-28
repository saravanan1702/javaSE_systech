package serializationdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentRec3 extends Child {
	String StdAddress;
	int stdId;

	StudentRec3(String name, String add, int id) {
		super(name);
		this.StdAddress = add;
		this.stdId = id;

	}

	public static void main(String[] args) {
		StudentRec3 s = new StudentRec3("saravanan", "Trichy", 3);// passing constructor values
		try {
			FileOutputStream fileout = new FileOutputStream("s.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(s);
			out.close();
			fileout.close();
			System.out.println("Object Serialized and saved in s.txt");

		} catch (IOException i) {
			i.printStackTrace();

		}

	}

}
