package datapack;
import Mypack.subpack.*;
import Mypack.subpack.*;
public class InvokingSubPackageExample {
	public static void main(String[] args) {
     Mypack.subpack.Operations k=new Mypack.subpack.Operations();
     k.square(12);
     Mypack.subpack.UsersInfo u=new Mypack.subpack.UsersInfo();
     u.UserInformation();
     
     
	}
}
