/*  1 
  1 2 
 1 2 3 
  1 
 1 2 
    1 
   1 2 
  1 2 3 
 1 2 3 4 
*/
package pattern;
public class star5 {

	public static void main(String[] args) {
		int a[] = { 3, 2, 4 };
		for (int y = 0; y < a.length; y++) {
			for (int i = 1; i <= a[y]; i++) {
				for (int k = a[y]; k >= i; k--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		try {
			System.out.println(a[3]);
		}
		catch(Exception e) {
			System.out.println("In catch");
		}
		
	}
}