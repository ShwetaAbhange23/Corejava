package collection;

import java.util.Hashtable;

public class HashtableEx {

	public static void main(String[] args) {
		Hashtable<String,String> hash_table = new Hashtable();
		hash_table.put("1", "Monday");
		hash_table.put("2", "Tuesday");
		hash_table.put("3", "Wednesday");
		hash_table.put("4", "Thursday");
		hash_table.put("5", "Friday");
		hash_table.put("6", "Saturday");
		hash_table.put("7", "Sunday");
		hash_table.put("8", "Sunday");
		hash_table.putIfAbsent("9", "day");
		System.out.println(hash_table);
	}

}
