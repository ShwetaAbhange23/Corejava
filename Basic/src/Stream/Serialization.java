package Stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Serialization{
	
	public static void main(String[] args) throws IOException {
		Employee e = new Employee();
		e.id = 2325;
		e.name = "Shweta";
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("data inserted in file");
		oos.close();
	}

}
