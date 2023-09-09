package Java8;

import inheritance.Override;

interface MyInter1{
	void msg();
	default void display() {
		System.out.println("Default method of interface");
	}
	static void displayStatic() {
		System.out.println("Static display method");
	}
}
interface MyInter2{
	void msg2();
}
class InterfacePro implements MyInter1, MyInter2{
	public static void main(String[] args) {
	
	InterfacePro d1 = new InterfacePro();
	d1.msg();
	d1.msg2();
	d1.display();
	MyInter1.displayStatic();
	}
	public void msg() {
		System.out.println("My abstract method");
	}
	@java.lang.Override
	public void msg2() {
		System.out.println("My static method");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
