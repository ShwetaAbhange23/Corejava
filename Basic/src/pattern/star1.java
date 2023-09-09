package pattern;

public class star1 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			for(k=i;k<=3-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=1;j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

}
