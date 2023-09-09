package practice;

public class InAmsterdam {
	static int countAm(String str) {
		String arr[];
		int count = 0;
		arr = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			if("am".equalsIgnoreCase(arr[i])) {
				count++;
			}
		}
		return count;
	}	
	public static void main(String[] args) {
		int c1 = countAm("I Am Amsterdam i am");
		System.out.println(c1);
	}
}