package SmallPrograms;

public class SevenStartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


for  (int i=1; i<=4;i++)
{
	for(int j=4;j>=i;j--) {
		System.out.print(" ");
	}
	for (int r=1; r <=i; r++)
	{
		System.out.print(i);

	}
	for (int l=2; l<=i; l++) 
	{
		System.out.print(i);

	}
	System.out.println();

}

	
/*		
		for  (int i=1; i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			
			for (int r=4; r >=i; r--)
			{
				System.out.print("*");

			}
			for (int l=3; l>=i; l--) 
			{
				System.out.print("*");

			}
			System.out.println();

		}
		*/
	}
	}