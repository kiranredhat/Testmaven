package SmallPrograms;
//2,5,7,11,13
public class PrimeNumber {
	public static void main(String[] args) 
	{
		{
			int[] num= {4,3,5,9};
			for (int i=0; i<num.length;i++)
			{
				if(num[i]%2==0)
				{
					System.out.println( +num[i] +" Number is Not Prime");
				}
				else
				{
					System.out.println( +num[i] +" Number is Prime");
				}
			}
		}
		
		}
	}


