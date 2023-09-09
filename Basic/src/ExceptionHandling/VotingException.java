package ExceptionHandling;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}
public class VotingException{//void
	String validAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Invalid age");
		}
		else {
			//System.out.println("Valid age");
			return "Valid age";
		}
	}
	public static void main(String[] args) {
		VotingException v = new VotingException();
		
		try {
			v.validAge(2);
		}catch(InvalidAgeException e){
			System.out.println("Exception occur");
			System.out.println(e.getMessage());
		}

	}

}
