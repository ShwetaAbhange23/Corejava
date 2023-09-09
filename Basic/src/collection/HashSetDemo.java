package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

class Department {
	int did;
	String dname;

	public Department(int did, String dname) {
		this.did = did;
		this.dname = dname;
	}

	private int getdid() {

		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname() {
		this.dname = dname;
	}
//			public Department(int did,String dname) {
//				this.did = did;
//				this.dname = dname;
//			}
}

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Department> hs = new HashSet<>();
		// Department d1 = new Department();
		// d1.setDid(10);
		// d1.setDname("HR");
		// hs.add(d1);
		hs.add(new Department(1, "Sales"));
		hs.add(new Department(2, "IT"));
		System.out.println("Departments:");
		for (Department d : hs) {
			System.out.println("ID :" + d.did);
			System.out.println("Name :" + d.dname);
		}
	}

}