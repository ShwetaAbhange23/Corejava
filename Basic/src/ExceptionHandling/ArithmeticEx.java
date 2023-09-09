package ExceptionHandling;

public class ArithmeticEx {

	public static void main(String[] args) {
		try {
			int c = 10/4;
			System.out.println("Value of c: "+c);
			int a[] = {1,2,3,4,5};
			a[2] = 45;
			System.out.println(a[2]);
			int a1 = Integer.parseInt("123");
			System.out.println(a1);
			String data = "abc";
			System.out.println("length:"+data.length());
			String[] data1=new String[5];//throws runtime exception
			data1[1] = "more data";
			Integer[]intArray = {5,7,9,11,12,15};
			System.out.println("First element:"+intArray[0]);
			System.out.println("Last element:"+intArray[-8]);
		}
		catch(ArithmeticException e){
			System.out.println("number can not divide by zero:");
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		catch(NegativeArraySizeException e4) {
			System.out.println(e4);
		}
		finally {
			System.out.println("End of code");
		}
	}

} 
