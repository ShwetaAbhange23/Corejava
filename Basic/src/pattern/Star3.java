package pattern;
class Star3
{


public static void printMiddleBottomPyramid(int numRows) {
		for(int i=numRows;i>=1; i--) 
		{
			for(int j=1; j<=numRows-i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}