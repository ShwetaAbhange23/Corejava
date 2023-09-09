package oops;

public class Compiletimepoly {
	void add(int a) {
		System.out.println("Sum of :"+(a++));
		}
	void add(int a,int b) {
		System.out.println("Sum of :"+(a+b));
	}
	void add(float a,float b) {
			System.out.println("Sum of :"+(a+b));
		}	
	public static void main(String[] args) {
	Compiletimepoly c = new Compiletimepoly();
	c.add(12);
	c.add(2, 5);
	c.add(2,4.2f);
	c.add(3.2f,4.1f);
	}

}
