/*package com.array;

class Student{
	String name;
	int score;
	public Student(String name,int score ) {
		this.name=name;
		this.score=score;
	}
}
class Classroom{
	public String registerStudent(Student stud) {
	
	{
		if(!stud.name.equals(stud.name.toLowerCase())) {
			return "Block Letters needed!!";
		}
		if(stud.score<0 || stud.score>100) {
			return "Invalid Score!!";
		}
		return "Registered";
	}
	public String studentCard(String card) {
		if (!card.matches("\\d+")) {
			return "Invalid card";
		}
		else {
			return "Valid card";
		}
	}
}
public class ClassRoom {

	public static void main(String[] args) {
	 Student s=new Student("SHWEta" ,-60);
	  Classroom c=new Classroom();
	  String str= c.registerStudent(s);
	  System.out.println(str);
	  String str1=c.studentCard("25");
	  System.out.println(str1);
	}

}*/
package array;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
}
class Classroomval{
	public String registerStudent(Student stud) {
		
//		if(!stud.name.matches("[A-Z]+")) {
		if(!stud.name.equals(stud.name.toUpperCase())) {
			return "Block Letters needed!!";
		}
		if(stud.score<0 || stud.score>100) {
			return "Invalid Score!!";
		}
		return "Registered";
	}
	public String studentCard(String card) {
		if (!card.matches("\\d+")) {
			return "Invalid card";
		}
		else {
			return "Valid card";
		}
		
	}
}

public class Classroom {
	static void test() {
		System.out.println("in test");
	}

	public static void main(String[] args) {
		Student s = new Student("Java" , -70);
		Classroomval c = new Classroomval();
		String str = c.registerStudent(s);
		System.out.println(str);
		String str1 = c.studentCard("bgv0");
		System.out.println(str1);
		test();
	}

}

