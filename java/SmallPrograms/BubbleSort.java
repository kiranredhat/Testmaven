package SmallPrograms;

class BubbleSort
{
    public static void main(String arg[])
    {

    	//int a[]= {8,5,1,3,2};
    	//int temp;
    	String[] a= {"Kiran", "Prajakta", "Supriya"}; //For Character Sorting.
    	String temp;// For Character Sorting.

    	for (int i=0; i<a.length; i++)
    	{
    		int flag=0;
    		for (int j=0; j<a.length-1-i; j++)
    		{
    			//if (a[j]> a[j+1])
    			if (a[j].compareTo(a[j+1])>0)//For character Sorting
    			{
    				temp =a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    				flag=1;
    			}
    			
    			
    		}
    			if (flag==0)
    			{
    				break;
    			}
    			
    		
    	}
    		for (int i=0; i<=a.length-1;i++)
    		{
    			System.out.print(a[i]+" ");
    		}
    }
 }