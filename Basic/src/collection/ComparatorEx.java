package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
	String movieName;
	int movieYear;
	double rating;
	public Movie(String movieName,int movieYear, double rating) {
	this.movieName = movieName;
	this.movieYear = movieYear;
	this.rating = rating;
	}
	public String toString() {
		return "Movie [movieName= "+movieName +",movieYear = "+",rating = "+rating +"]" ;
	}
}
class SortByYear implements Comparator<Movie>
{
	@Override
	public int compare(Movie o1, Movie o2) {
	
		return o1.movieYear-o2.movieYear;
}
}
class SortByName implements Comparator<Movie>
{
@Override
public int compare(Movie o1, Movie o2) {

	return o1.movieName.compareTo(o2.movieName);
}
}
	class ComparatorEx {
		public static void main(String[] args) {
			ArrayList<Movie> list = new ArrayList<Movie>();
			list.add(new Movie("DDl",2000,4.5));
			list.add(new Movie("KGF",2002,4.9));
			list.add(new Movie("DDLJ",2001,4.3));
			list.add(new Movie("Bhaggi",2010,4.3));
			//Collections.sort(list,new SortByYear());
			Collections.sort(list,new SortByName());
			for(Movie m:list) {
				System.out.println(m);
			}
		}

}



