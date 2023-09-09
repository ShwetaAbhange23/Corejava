package inheritance;//override
class Shapes1{
	int i,j;
	Shapes1(int length,int breadth) {
		i = length;
		j = breadth;
	}
	void area() {
	System.out.println("length is :"+i+"breadth is:"+j);
	}
}
class triangle1 extends Shapes1{
	
	triangle1(int length,int breadth) {
		super(length,breadth);
	}	
	void area() {
		
		super.area();//call constructor
		System.out.println("area of triangle: "+(i*j));
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		Shapes1 s = new Shapes1(2,5);
		triangle1 r = new triangle1(2,6);
		s.area();
		r.area();
		
		
	}
}
