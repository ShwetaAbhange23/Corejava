package practice;
class Abc {
		
	int i,j;
	void parent() {
	System.out.println("Addition::"+(i+j));
	}
}
class Def extends Abc{
	int k;
	void subchild() {
		System.out.println("Addition:"+(i+j+k));
	}
	void add() {
		System.out.println("Multiplication:"+(k*k));
	}
}
 class Inheritance {

	public static void main(String[] args) {
		Abc ab=new Abc();
		Def de=new Def();
		ab.i=10;
		ab.j=4;
		ab.parent();
		de.i=2;
		de.j=6;
		de.k=3; 
		de.subchild();	
		de.add();
	}	
}
