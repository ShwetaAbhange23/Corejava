package Java8;
@FunctionalInterface
interface Display{
	void display();
}
public class MethodEx {
	public void myMethod() {
		System.out.println("Method referance in java 8");
	}
	public static void main(String[] args) {
		MethodEx obj = new MethodEx();
		obj.myMethod();
		System.out.println("+++++++++++++");
		Display ref = obj::myMethod;
		ref.display();
	}

}
