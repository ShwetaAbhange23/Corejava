package Aggrigation;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e = new Employee();
		int sal = e.getSalary();
		System.out.println(sal);
		System.out.println(e.getDesignation());
	}

}
