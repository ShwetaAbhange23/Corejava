/*  1 
  2 2 
 3 3 3 
  1 
 2 2 
    1 
   2 2 
  3 3 3 
 4 4 4 4 
*/
package pattern;

public class star4 {

	public static void main(String[] args) {
		int a[] = { 3, 2, 4 };
		for (int y = 0; y < a.length; y++) {
			for (int i = 1; i <= a[y]; i++) {
				for (int k = a[y]; k >= i; k--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
	}
}
