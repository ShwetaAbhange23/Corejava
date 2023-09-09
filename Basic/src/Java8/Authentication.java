package Java8;

	import java.util.Scanner;

	public class Authentication {
	    public static void main(String[] args) {
	        // Lambda expression to authenticate
	        AuthValidator validator = (username, password) ->
	                username.equals("COW") && password.equals("@Moooo");

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter username: ");
	        String username = scanner.nextLine();

	        System.out.print("Enter password: ");
	        String password = scanner.nextLine();

	        boolean isAuthenticated = validator.authenticate(username, password);
	        System.out.println("Authentication result: " + isAuthenticated);

	        scanner.close();
	    }

	    // Custom functional interface
	    interface AuthValidator {
	        boolean authenticate(String username, String password);
	    }
	}

