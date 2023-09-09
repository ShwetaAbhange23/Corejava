package inheritance;

interface Parent11{
	void display(); 
}

interface Parent22 {
	void display();
	void test();
	
}
class child implements Parent11, Parent22{

	//@Override
	public void display() {
		System.out.println("hi");
		
	}
	public void test(){
		
	}
	
}
public class Multiple1  {

	public static void main(String[] args) {
		child c = new child();
		c.display();
		Parent11 p1 = new child();
		p1.display();
		Parent22 p2 = new child();
		p2.display();
		p2.test();
	}

}
