package oops;
public class Compiletimepoly1 {
	int add(int a) {
		return a;
		}
	int add(int a,int b) {
		return a+b;
	}
	float add(float a,float b) {
			return a+b;
		}	
	public static void main(String[] args) {
		Compiletimepoly1 c=new Compiletimepoly1();
		c.add(5);
		c.add(2,6);
		c.add(4.6f,2.1f);

}
}