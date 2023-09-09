package collection;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

	class Employee1 implements Comparable<Employee1>{
		private String name;
		private int salary;
		 
		public Employee1(String name, int salary) {
			 this.name = name;
			 this.salary = salary;
		 }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary ;
		}
		public void setSalary() {
			this.salary = salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
		return "Employee1 [name = "+name +",salary ="+salary +"]";	
		}
		public int compareTo(Employee1 e) {
		if (this.getSalary() > e.getSalary()) {
			return 1;
		}
		else if(this.getSalary() < e.getSalary()) {
			return -1;
		}else {
			return 0;
		}}
		public int compareTo(Employee e) {
			return this.name.compareTo(e.getName());
		}
	
       
public class Emp {
	public static void main(String[] args) {

	List<Employee1> employees = new ArrayList<>(Arrays.asList(
			new Employee1("kapil", 2000),
            new Employee1("amit", 1500),
            new Employee1("dilip", 1000),
            new Employee1("bipasha", 45000)));
			Collections.sort(pq);
	Collections.sort(employees);
	for (Employee1 e : employees) {
    	System.out.println(e.getName() + " => " + e.getSalary());
    }

	}
}
}

