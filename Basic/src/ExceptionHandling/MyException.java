/*class MyException: Define exception


 class Source:
 method definitons:
 checkName(String firstName,String lastName)throw a user defined
exception if firstName and lastName is blank else return name
 return type: String
 visibility: public
 
 * checkName(String firstName,String lastName): throw a user defined exception if
firstName and lastName is blank else return name*/

package ExceptionHandling;

import java.util.Scanner;

public class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}

	public class CheckNameException{
		public String CheckName(String firstName, String lastName) throws MyException {
			if (fname.isEmpty()) {
				throw new MyException("first name is empty");
			} else if (lname.isEmpty()) {
				throw new MyException("last name is empty");
			} else {
				return "welcome" + fname + lname;
			}
		}

		public static void main(String[] args) {
			MyException x = new MyException(null);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first name");
			java.lang.String fname = scan.nextLine();
			System.out.println("Enter last name");
			java.lang.String lname = scan.nextLine();

			String s;
			try {
				s = x.CheckName(fname, lname);
				System.out.println(s);
			} catch (MyException e) {
				System.out.println(e);
			}

		}
	}

}
