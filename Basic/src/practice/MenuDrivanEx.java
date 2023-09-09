package practice;
import java.util.Scanner;
public class MenuDrivanEx {

	public static void main(String[] args) {
		int a,b,c,ch;
		float d;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("****WELCOME TO SIMPLE CALCULATOR****");
			System.out.println("What do you want to do");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("0.Exit");
			System.out.println("Enter your choice");
			ch=scan.nextInt();
			
			switch(ch) 
			{
				case 1: System.out.println("Enter two number");
				a = scan.nextInt();
				b = scan.nextInt();
				c = a+b;
				System.out.println("Addition : "+c);
				break;

				case 2: System.out.println("Enter two number");
				a = scan.nextInt();
				b = scan.nextInt();
				c = a-b;
				System.out.println("Subtraction : "+c);
				break;
				
				case 0 : System.exit(0);
				
				default : System.out.println("Invalid choice");
				break;
				}
		
		}while(ch!= 0);
}
	}

