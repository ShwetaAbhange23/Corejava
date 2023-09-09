package Stream;

import java.io.Serializable;
//object to stream of byte
public class Employee implements Serializable {

	public int id;
	public String name;
	public void Employee() {
		System.out.println("Name:" + name + "Address:" + id);
	}
}