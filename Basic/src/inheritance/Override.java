package inheritance;
class A{
	int i,j;//constructor
	A(int a,int b){
		i=a;
		j=b;
	}
	void show()
	{
		System.out.println("i:"+i+"j:"+j);
	}
	
}
class B extends A{
	int k;
	B(int a,int b,int c){
		super(a,b);
		k=c;
	}
	void show()
	{
		super.show();
		System.out.println("k:"+k);
	}
}
public class Override {

	public static void main(String[] args) {
	B subs= new B(1,3,5);
	subs.show();
	A s=new A(2,5);
	s.show();
	
	}

}
