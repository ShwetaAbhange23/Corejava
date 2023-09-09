package Java8;
interface Validate{
	boolean isValidate(String username,String password);
}
public class Source {

	public static void main(String[] args) {
		Validate v = (String username,String password)->{if(username.equals("ABC")&& password.equals("DEF")) {
		return true;}
		else {
			return false;
		}
	};
	//s.v.Validate("ABC","DEF");
	}
}

