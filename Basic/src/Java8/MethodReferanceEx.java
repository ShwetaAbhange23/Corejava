package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferanceEx {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(122, 56, 43, 22, 13, 5, 59,56);
		System.out.println("My List :"+num);
		
		num.forEach(l->System.out.println(l));
		System.out.println("****");
		num.forEach(System.out::println);
		//Collections.sort(num,(i1,i2) -> i1.compareTo(i2));
		
		Collections.sort(num, new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2) {
			return i1.compareTo(i2);
		} 
	});
		System.out.println("For loop :");
		for(Integer i:num) {
			System.out.println(i+" ");
		}
		//anonymous function
		System.out.println("Anonymous func.....");
		num.forEach(System.out::println);
		System.out.println();
		//Object :: methodName
		//lambda function...
		System.out.println("Lambda func...");
		Collections.sort(num,(i1,i2) -> i1.compareTo(i2));
		num.forEach(System.out::println);
		System.out.println();
		
		//method referance...
		System.out.println("method referance...");
		Collections.sort(num,(i1,i2) -> i1.compareTo(i2));
		num.forEach(System.out::println);
	
	}

}
