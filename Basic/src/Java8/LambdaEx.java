package Java8;

interface Myinterface {
	int mul(int a, int b);
}

interface EvenOdd {
	int evod(int a);
}

interface RebString {
	int evod(int a);
}

public class LambdaEx {
	// private static int var =10;
	public static void main(String args[]) {
		Myinterface mf = (int a, int b) -> a * b;
		System.out.println("Multiplication is:..." + mf.mul(4, 7));
		Myinterface mf1 = (int a, int b) -> a + b;
		System.out.println("Sum:..." + mf1.mul(4, 7));
		// lambda expresss with one parameter
		// int a same para pass
		EvenOdd eo = (int a) -> {
			if (a % 2 == 0)
				System.out.print("even no.");
			else
				System.out.print("even no.");
			return a;
		};
		System.out.println(eo.evod(8));

		/*
		 * RevString rs = (String s) -> { String revs = ""; for(int i =
		 * s.length()-1;i>=0;i--) { char w = s.charAt(i); revs = revs+w; } return revs;
		 * }; System.out.println("Reverse :"+rs.rev("Welcome"));
		 */
	}
}
