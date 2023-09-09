package ExceptionHandling;
/*An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime 
Exceptions.
• Unchecked exceptions are extended from the java.lang.RuntimeException class.
• Java Virtual Machine (JVM) handles such exceptions.
• Example : ArithmeticException, ArrayIndexOutOfBoundsException, etc.*/
public class CheckedException {

	public static void main(String[] args) {
		try 
		{
			Class.forName("basic.operatorEx");
			System.out.println("class found");
		}
		catch(Exception e)
		{
			System.out.println("class not found:"+e);
			//e.printStackTrace();
		}
		finally {
			System.out.println("End of block");
		}
		
	}

}
