package oops;

class Rectangle {
	private double l;
	private double w;

	public Rectangle() {
		l = 0;
		w = 0;
	}

	public Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}

	public double getArea() {
		return l * w;
	}
}

class Box extends Rectangle {
	private double l;
	private double h;

	public Box(double l,double h) {
		super(l, h);
		this.h = h;
	}
	public Box(double l, double w, double h) {
		super();
		this.h = h;
	}

	public double getVolume() {
		double area = getArea();
		double volume = area * h;
		return volume;
		//return getArea() * h;
	}
	public static void temp(String s){
		System.out.println(s);
	}
}

public class ConstructorStatic {

	public static void main(String[] args) {
		Box b1 = new Box(2.5,3.5);
		System.out.println("volume: " + b1.getVolume());
		Box b2 = new Box(12.2, 4, 5);
		System.out.println("volume: " + b2.getVolume());
		//Box b3 = new Box(2.5,3.5);
		Box.temp("Shweta");
	}

}
