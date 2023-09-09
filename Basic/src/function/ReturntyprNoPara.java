package function;
//return type and no parameter
//input function output main
class Method{
	int add() {
		int a = 2 , b = 4;
		return(a+b);
		
	}
}
public class ReturntyprNoPara {

	public static void main(String[] args) {
		Method m = new Method();
		int c;
		c=m.add();
		System.out.println("Addition is : "+c);
		
	}

}
