package pattern;

public class Star2 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			for(k=1;k<=3-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
