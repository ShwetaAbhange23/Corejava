/*[Ant, Cockroach, bee, paper wasp]
[Insect [insectname=Cockroach, insectWeight=70], Insect [insectname=bee, insectWeight=99]]
*/
package collection;

import java.util.ArrayList;
import java.util.List;

class Insect {
	public String insectname;
	public int insectWeight;
	public Insect() {}
	public Insect(String insectName, int insectWeight) {
		//super();
		this.insectname = insectName;
		this.insectWeight = insectWeight;
	}

	public String getInsectName() {
		return insectname;
	}

	public void setInsectname(String insectName) {
		this.insectname = insectName;
	}

	public int getInsectWeight() {
		return insectWeight;
	}

	@Override
	public String toString() {
		return "Insect [insectname=" + insectname + ", insectWeight=" + insectWeight + "]";
	}
	
}

class Insecticides {
	public List<String> mapInsectstName(List<Insect> list) {
		List<String> s = new ArrayList<>();
		for (Insect i : list) {
			//String n=i.getInsectName();
			//s.add(n);
			s.add(i.getInsectName());
		}
		return s;
	}

	public List<Insect> getWeight(List<Insect> list) {
		List<Insect> s1 = new ArrayList<>();
		for (Insect i : list) {
			int weight = i.getInsectWeight();
			if (weight > 40 && weight <= 100) {
				s1.add(i);
			}
		}
		return s1;
	}
}

public class InsectMain {

	public static void main(String[] args) {
		List<Insect> l = new ArrayList<>();
		/*Insect i = new Insect();
		i.insectname = "ant";
		i.insectWeight = 20;
		l.add(i);
		Insect i1 = new Insect();
		i1.insectname = "Cockroach";
		i1.insectWeight = 70;
		l.add(i1);
		Insect i2 = new Insect();
		i2.insectname = "bee";
		i2.insectWeight = 99;
		l.add(i2);
		Insect i3 = new Insect();
		i3.insectname = "paper wasp";
		i3.insectWeight = 11;
		l.add(i3); */

		l.add(new Insect("Ant",40));
		l.add(new Insect("Cockroach",70));
		l.add(new Insect("bee",99));
		l.add(new Insect("paper wasp",11));
		
	 Insecticides ii = new Insecticides();
	//List<String> a =ii.mapInsectstName(l);
	//System.out.println(a);
	System.out.println(ii.mapInsectstName(l));
	System.out.println(ii.getWeight(l));
}
}
