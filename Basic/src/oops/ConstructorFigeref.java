package oops;
class Employee{
	double i;
	Employee(double payment)
	{
		i=payment;
	}
	void salary()
	{
		System.out.println("Salary is: "+i);
	}
}
class Clark extends Employee{
		Clark(double payment){
		super(payment);
	}
		void salary() {
			super.salary();
			System.out.println("Salary of clark:"+i);
		}
}
class Manager extends Employee{
	Manager(double Payment){
		super(Payment);
	}
	void salary() {
		super.salary();
		System.out.println("Salary of clark:"+(2*i));
	}
}
public class ConstructorFigeref {
 
	public static void main(String[] args) {
		Employee emp=new Employee(4000);
		emp.salary();
		Clark ck=new Clark(2000);
		ck.salary();
		Manager mr=new Manager(5000);
		mr.salary();
	}

	
}
