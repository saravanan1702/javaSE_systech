package serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Staticserilliazation implements Serializable {
	static int x = 50;

	public static void main(String[] args) {
		Staticserilliazation o=new Staticserilliazation();
		System.out.println("Serialization Succeful,Static Member value :" + x);
		try {
			FileOutputStream f=new FileOutputStream("s.txt");
			ObjectOutputStream ob=new ObjectOutputStream(f);
			ob.writeObject(o);
			ob.close();
			x=48;
			FileInputStream fi=new FileInputStream("s.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			o=(Staticserilliazation) oi.readObject();
			oi.close();
			System.out.println("After Deserialization,Static Member has value :"+x);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}
}

