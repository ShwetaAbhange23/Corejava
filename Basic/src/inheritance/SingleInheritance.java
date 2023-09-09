package inheritance;
class Vehical{
	String vname;
	void displayV() {
		System.out.println("Parent class :"+vname);
	}
	void display() {
		System.out.println("Parent class display:");
	}
}
class Bike extends Vehical{
	int speed;
	void dipspeed() {
		System.out.println("Bike speed:"+speed);
	}
	void dispay() {
	System.out.println("Child class display");
}}
public class SingleInheritance {

	public static void main(String[] args) {
	Vehical v=new Vehical();
	v.vname="car";
	v.displayV();
	Bike b=new Bike();
	b.speed=100;
	b.dipspeed();
	v.vname="honda";
	b.displayV();
	b.display();
	//b.vehicalType();
	}

}
