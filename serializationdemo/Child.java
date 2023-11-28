package serializationdemo;

import java.io.Serializable;

public class Child implements Serializable {
	String stdName;

	Child(String name) {
		this.stdName = name;
	}
}

