package oops;

abstract class Plane {
	
	abstract void takeoff();
	abstract void fly();
	abstract void land();
	void msg() {
		System.out.println("In plane");
	}
}
class cargoplane extends Plane{
	
	@Override
	void takeoff() {
		
		System.out.println("Cargoplane takeoff");
	}
	void fly()  {
		System.out.println("Cargoplane flying");
	}
	void land() {
		System.out.println("Cargoplane landing");
	}
	
}
class FighterPlane extends Plane{
	
	@Override
	void takeoff() {
		
		System.out.println("FighterPlane takeoff");
	}
	void fly()  {
		System.out.println("FighterPlane flying");
	}
	void land() {
		System.out.println("FighterPlane landing");
	}
}
class AbstractPlane{
	public static void main(String[] args) {
		cargoplane pl = new cargoplane();
		FighterPlane fl = new FighterPlane();
		fl.takeoff();
		fl.fly();
		fl.land();
		pl.takeoff();
		pl.fly();
		pl.land();
		Plane aref;
		aref = pl;
		aref.takeoff();
		aref.fly();
		aref.land();
		fl.msg();
		}
}

