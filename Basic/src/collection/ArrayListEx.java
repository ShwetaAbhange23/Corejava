/*My arraylist:[Sweety, Shweta, Angel, null, Akshata, null]
My arraylist:[Sweety, Shweta, null, Akshata, null]
First Position:Shweta
My arraylist:5
My arraylist:[Sweety, Neha, null, Akshata, null]
My arraylist:[Sweety, Neha, null, Akshata, null]
*/
package collection;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Sweety");
		a1.add("Angel");
		a1.add(1, "Shweta");
		//a1.add(3, null);
		a1.add("Aksha");
		//a1.add(null);
		System.out.println("My arraylist:"+a1);
		a1.remove(2);
		System.out.println("My arraylist:"+a1);
		System.out.println("First Position:"+a1.get(1));
		a1.set(1, "Neha");
		System.out.println("My arraylist:"+a1.size());
		System.out.println("My arraylist:"+a1);
		ArrayList<String> all= new ArrayList<>();
		all.addAll(a1);
		System.out.println("My arraylist:"+all);
		ArrayList<Float> af = new ArrayList<>();
		af.add(1.3f);
		System.out.println("My arraylist1:"+af);
		Collections.sort(a1);
		System.out.println("Sorting data:");
		System.out.println("My data:"+a1);
		for(String str: a1) {
			System.out.println(str);	
		}
		for(int i=0;i<=50;i+=2){
			System.out.println(i);
		}
		for(Float st:af) {
			System.out.println(st);
		}
	}

}
