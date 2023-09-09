package oops;//without body and no method of abstract

abstract class AbstractEx {
	abstract void display();// method declaration-abstract method

	void msg() {// method defination-non abstract method
		System.out.println("Hello");
	}
}

class AbstractChild1 extends AbstractEx {

	@Override
	void display() {
		System.out.println("Abstract child1");
	}
}

class AbstractChild2 extends AbstractEx {

	@Override
	void display() {
		System.out.println("Abstract child2");
	}

}

public class Abstractclass {

	public static void main(String[] args) {
		// AbstractChild a = new AbstractChild();
		AbstractChild1 b = new AbstractChild1();
		b.display();
		b.msg();
		AbstractEx aref;
		aref = b;
		aref.display();
	}

}
