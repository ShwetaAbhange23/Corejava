package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpStream {

	public static void main(String[] args) {
		ArrayList<Emp> a1 = new ArrayList<>();
		a1.add(new Emp(1,"Swapnil","Manager",23000));
		a1.add(new Emp(2,"Akshu","Tl",21000));
		a1.add(new Emp(3,"Sam","Developer",23000));
		a1.add(new Emp(4,"Swap","Trainer",23000));
		a1.add(new Emp(4,"Swap","Trainer",23000));
		
		List<String> li = a1.stream().map(e ->e.toString()).collect(Collectors.toList());
		System.out.println("Elements in emp list:"+li);
		
		Set<String> hs = a1.stream().map (e -> e.toString()).collect(Collectors.toSet());
		System.out.println("Elements in emp set:"+hs);
		
		long count = a1.stream().count();
		System.out.println(count);
		
		long c = a1.stream().filter(a -> a.getEname().startsWith("S")).count();
		System.out.println(c);
		
		Stream<Emp> namesStratsWith = a1.stream().filter(a -> a.getEname().startsWith("A"));
		System.out.println(namesStratsWith.collect(Collectors.toList()));
		
		List<String> namesofemp = a1.stream() .map(n->n.ename)
				.collect(Collectors.toList());   
		System.out.println("Name of Employee:"+namesofemp);
			
		EmpList.stream()
        .map(Emp::getDepartment)
        .distinct()
        .forEach(System.out::println);
		
	}

}
