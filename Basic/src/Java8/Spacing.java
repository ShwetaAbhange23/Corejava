package Java8;
interface StringSpacing{
	String Space(String str);
}
public class Spacing {

	public static void main(String[] args) {
		StringSpacing s = (String str)->{
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				System.out.print(c+" ");
			}
			return str;
		};
		s.Space("welcome");
	}

}
