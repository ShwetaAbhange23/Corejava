package inheritance;
class Father{
	String name="Shweta";
	void disMethod() {
	System.out.println("Father class");
}
}
class Son extends Father{
	String name="Swapnil";
	void displayName()
	{
		System.out.println("Parent name: "+super.name);
		System.out.println("Son name: "+name);
	}	
}
public class SuperVeriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.displayName();
		s.disMethod();
	}

}
