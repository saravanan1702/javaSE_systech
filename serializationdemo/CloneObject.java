package serializationdemo;

public class CloneObject {
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjClone obj3 = new ObjClone();
		obj3.d=40;
		ObjClone obj4=obj3;
		obj4.d=50;
		System.out.println(obj3.toString(obj3));
		ObjClone obj5=(ObjClone) obj4.Clone();
		obj5.d=60;
		System.out.println(obj4.toString(obj4));
	} 
}

class ObjClone implements Cloneable {
	int d;

	public Object toString(ObjClone obj3) {
		return d;
	}

	public Object Clone() throws CloneNotSupportedException {
		return super.clone();

	}
}