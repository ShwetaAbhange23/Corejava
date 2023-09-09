package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		int a[] = { 1, 5, 8 ,34,3};
		long count1= Arrays.stream(a).sum();
		System.out.println("Sum:"+count1);
		ArrayList<String> name = new ArrayList<>();
		name.add("Abhi");
		name.add("Radha");
		name.add("Anu");
		name.add("Aniket");
		name.add("Ashish");
		name.add("Krishna");

		// to use multiple function using stream api
		long count = name.stream().filter(a -> a.length() > 4 && a.length() < 7).count();
		System.out.println("Names length less than 5:...." + count);

		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count1 = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.println("Count space....." + count1);


		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> squares = num.stream().map(n -> n * n).toList();
		//.collect(Collectors.toList());
		System.out.println(squares);
		static int n = 15; 

//	private static boolean isPrime(int number) {
//		return number>1 && IntStream.range(2, number).noneMatch(i->number%i==0);
//	}
//	System.out.println("Prime checking...."+isPrime(n));
	
	
	}

}
