package oops;
abstract class Abstract1{
	abstract void display();
	void msg() {
		System.out.println("Hello");
	}
	static void msg1() {
		System.out.println("Hello1");
	}
}
class AbstractChild extends Abstract1{

	@Override
	void display() {
			
	}
}
public class AbstractWithStatic {

	public static void main(String[] args) {
		AbstractChild ch = new AbstractChild();
		ch.msg();
		Abstract1.msg1();//without using object we can access static method
	}
}
