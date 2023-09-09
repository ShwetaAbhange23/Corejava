package inheritance;
class Shapes
{
	int i,j;
	Shapes(int length,int breadth)//constructor
	{
		i=length;
		j=breadth;
	}
	void area() {
		System.out.println("i:"+i+"j:"+j);
	}
}
class Rectangle extends Shapes
{
	Rectangle(int length,int breadth){
		super(length,breadth);
	}
	void area() {
		super.area();
		System.out.println("Area of rectangle: "+(i*j));
	}
}
class Triangle extends Shapes
{
	Triangle(int length,int breadth){
		super(length,breadth);
	}
	void area() {
		super.area();
		System.out.println("Area of triangle: "+(0.5*i*j));
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Shapes s1=new Shapes(2,5);
		s1.area();
		Rectangle r1=new Rectangle(2,2);
		r1.area();
		Triangle t1=new Triangle(2,5);
		t1.area();
		

	}

}
