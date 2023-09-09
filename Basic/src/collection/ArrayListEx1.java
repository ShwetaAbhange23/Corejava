/*1.Add Student
2.Remove Student
3.Display student
Menu driven using arraylist*/
package collection;
import java.util.ArrayList;
import java.util.Scanner;
class Student{
	int No;
	String Name;
	String Grade;
	
	public Student(int No, String Name, String Grade ) {
		this.No = No;
		this.Name = Name;
		this.Grade = Grade;
	}
}
public class ArrayListEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> List = new ArrayList<Student>();
		int choice;
		do {
			System.out.println("Enter your choice :--> 1 ,2,3,4");
			choice = scan.nextInt();
			switch(choice) {
			case 1:System.out.println("1.Enter student details..");
				   System.out.println("1..Enter student ROllNo :");
				   int No = scan.nextInt();
				   System.out.println("1..Enter student Name :");
				   String Name = scan.next();
				   System.out.println("1..Enter student Grade :");
				   String  Grade= scan.next();
				   List.add(new Student(No,Name,Grade));
				   break;
			case 2:System.out.println("2.Enter student details..");
				for(Student scan1 : List) {
					System.out.println("2.. Student ROllNo :"+scan1.No);
					System.out.println("2.. Student Name :"+scan1.Name);
					System.out.println("2.. Student Grade :"+scan1.Grade);
					System.out.println("------------------------------");
				}
				break;
			case 3:System.out.println("3.Enter index to remove student details..");
					int n = scan.nextInt();
					List.remove(n);
					break;
			case 4:break;//4 to exit
			default:System.out.println("Invalid Choice..");
			}	
		}while(choice!=4);
		scan.close();
	}

}
