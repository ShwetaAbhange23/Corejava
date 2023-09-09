package collection;

import java.util.ArrayList;
		public class Campaign {
		    private String candidateName;
		    private ArrayList<String> donors;


		    public Campaign(String name, ArrayList<String> a1) {
		        candidateName = name;
		        donors = a1;

		    }

		    public static void main(String[] args) {

		        ArrayList <String> aa = new ArrayList <String>();
		        aa.add("Ram");
		        aa.add("Sita");

		        Campaign obj = new Campaign("Nischal",aa);
		        System.out.println(obj.candidateName + " "+ obj.donors);


		    }
		    
	}


