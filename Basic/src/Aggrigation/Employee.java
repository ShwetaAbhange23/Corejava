 package Aggrigation;

public class Employee {
	private Job job;

	public Employee() {
		this.job = new Job();
		job.setSalary(20000);
		job.setDesiganation("Developer");
//		job.getSalary();

	}
	int getSalary() {
		return job.getSalary();	
	}
	String getDesignation() {
		return job.getDesignation();}}