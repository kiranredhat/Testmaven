package SmallPrograms;

public class MyTestStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for (int l=4; l>=i; l--)
			{
				System.out.print("*");
			}
		System.out.println();
			}
		
	}

}
