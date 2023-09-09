package inheritance;
class Rectangle1{
	private double length;
	private double width;
	public int heigth;
	public Rectangle1() {
		length = 2;
		width = 4;
	}
	public Rectangle1(double length,double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	}
class Box extends Rectangle1{
	private double heigth;
	private double height;
	
	public Box() {
		super();
		super.heigth = 2;
	}
	public Box(double length, double width,double heigth) {
		super(length,width);
		this.heigth = height;
	}
	public double getVolume() {
		return getArea() * height;
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
	Box b1 = new Box();
	System.out.println("Volume:"+b1.getVolume());
	Box b2 = new Box(12.2,3.4,2.1);
	System.out.println("Volume:"+b2.getVolume());
	}

}
