package oops;
interface Parent11{
	void displayParent1();
}
interface Parent2{
	void displayParent2();
}
interface Child extends Parent11,Parent2{
	void displayChild();
}
class Child1 implements Child{

	@Override
	public void displayParent1() {
		System.out.println("Parent11");
		
	}

	@Override
	public void displayParent2() {
		// TODO Auto-generated method stub
		System.out.println("Parent2");
	}

	@Override
	public void displayChild() {
		System.out.println("Child");
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.displayParent1();
		c.displayParent2();
		c.displayChild();
		
	}

}
