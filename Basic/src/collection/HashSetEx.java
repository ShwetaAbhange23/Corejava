package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
public class HashSetEx {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<>();
		ArrayList<String> a1 = new ArrayList<>();
		hs.add("Sweety");
		hs.add("Angel");
		hs.add("Shweta");
		hs.add("Aksha");
		hs.add("xy");
		System.out.println("Tree Set:"+hs);
		System.out.println("*****Using Enhanced for loop********");
		for(String i:hs) {
			System.out.println(i);
		}
		System.out.println("*****Using Iterator************");
		Iterator<String> i = hs.iterator();
        while(i.hasNext()) 
            System.out.println(i.next());
	}

}
