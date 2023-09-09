package Java8;

public class BinaryToDecimal {

	public static void main(String[] args) {

		int a = 12;// Decimal
		String b = Integer.toBinaryString(a);
		System.out.println(b);

		String f = Integer.toBinaryString(a);
		System.out.println(f);

		String c = Integer.toOctalString(a);
		System.out.println(c);

	}

}
