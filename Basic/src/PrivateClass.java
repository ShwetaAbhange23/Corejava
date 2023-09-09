 class PrivateEx {
	 private int b=20;
	 private String name;
	 public void displayB() {
		 System.out.println("value of B:+b");
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
 }
 public class PrivateClass{
	 private int a=10;
	 private void display() {
		 System.out.println("Value of a:"+a);
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateClass p=new PrivateClass();
		System.out.println("Value of a:"+p.a);
		p.display();
		PrivateEx p1=new PrivateEx();
		p1.displayB();
		p1.setName("Edubridge");
		System.out.println("Name :"+p1.getName());
		}

	
 }

