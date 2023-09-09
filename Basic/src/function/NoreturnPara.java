package function;//no return typ no paramerter

class Number// input and output function
{
	void add() {
		int a = 4, b = 7;
		System.out.println("Addition: "+(a+b));
	}
}

public class NoreturnPara {

	public static void main(String[] args) {
		Number m=new Number();	
		m.add();
	}

}
