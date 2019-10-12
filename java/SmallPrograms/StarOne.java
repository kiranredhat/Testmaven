package SmallPrograms;

public class StarOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
for(int i=1; i<=4; i++) {

//	for(int j=1; j<=i; j++) //This loop is for ascending order start
	
//	 *
//	 **
//	 ***
//	 ****
	  	 
	
//	for(int k=4; k>=i; k--)	//This loop is for descending order start
		 
//		****
//		***
//		**
//		*
	{
		System.out.print("*" +" ");
	}
System.out.println();
	}
*/
		
/*		for(int i=1; i<=4; i++) {

			for(int j=4; j>i; j--)	
			{
				System.out.print(" ");
			}
			for (int l=1; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
*/

//	        *
//		   **
//		  ***
//		 ****
		
	 for(int i=1; i<=4; i++) 
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
	 
//	 ****
//	  ***
//	   **
//	    *

	 

		
	}
}
