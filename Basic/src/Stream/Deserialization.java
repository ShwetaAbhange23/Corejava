package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee e = null;
	FileInputStream fis = new FileInputStream("emp.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	e = (Employee) ois.readObject();
	System.out.println("Deseriliazation object.");
	System.out.println("name:"+e.name);
	System.out.println("id:" +e.id);
	e.Employee();
	ois.close();
	fis.close();
	}

}
