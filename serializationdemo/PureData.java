package serializationdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PureData {
	public static void main(String[] args) throws IOException {
     FileOutputStream fos=new FileOutputStream("data.txt");
     DataOutputStream dos=new DataOutputStream(fos);
     dos.writeUTF("JAVA PROGRAMMS");
     FileInputStream fis=new FileInputStream("data.txt");
     DataInputStream dis=new DataInputStream(fis);
     System.out.println(dis.readUTF());
	}
}
