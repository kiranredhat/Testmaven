package SmallPrograms;

public class TwoDimenstionalArray {
	String k="";


	public static void printArrayValues()
	{
		String a[][]={{"kiranOne","kiranTwo","kiranThree"},
				  {"saaviOne","saaviTwo","saaviThree"}}; 
	//This is normal for loop
	for (int i=0; i<=1; i++)
	{
		for (int j=0;j<=2; j++)
		 {		
			System.out.print(a[i][j] +" ");
	   	}
		System.out.println();
	}
	//------------------------------------------------------------
	// This is Enhance for loop
	//for (int i[]: a)
	//{
//			for (int j: i)
//			{
//				System.out.print(j+ " ");
//			}
//			System.out.println("");
//		}
	//}
	}
	
	public static void sum()
	{
		int res=0;
		int [][]arr= {{5,6,8},
					  {6,8,2}};
//		Method: 10
//--------------------------------------------------------------
//		for (int i[]:arr)
//		{
//			for(int j:i)
//			{
//				res=res+j;
//			}
//		}	
//		System.out.println(res);
//----------------------------------------------------------------
//		Method:2
		for ( int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				res= res+arr[i][j];
			}
		}
		System.out.println(res);
		
		
	}		
	
	public static void main(String[] args) {
		TwoDimenstionalArray.printArrayValues();
		TwoDimenstionalArray.sum();

}
	
}
