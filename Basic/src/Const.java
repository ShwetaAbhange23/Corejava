
class Const {
	int a,b;
	Const()
	{
		System.out.println("Constructor called");;
		a=10;
		b=20;
	}
	double volume()
	{
		return a+b;
	}
}
class Constdemo
{
	public static void main(String[] args) {
		Const s1=new Const();
		Const s2=new Const();
		double v;
		v=s1.volume();

	}
}

