package SmallPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;
	class kirantest4
	{
		public int show(int a)
		{		int x=a;
			System.out.println("Hello"+a);
			return x;
		}
	
		public void show(int a,int b)
		{		
			System.out.println("Hello"+a);
			String []str= {"Kiran","Kiran2"};
			int cont=str.length;
			for (int i=0;i<cont-1;i++)
			{
				
			}
		}
}
	class kirantest5 extends kirantest4
	{
		public void show(double a, int b)
		{		
			System.out.println("Hello "+a+ " "+b);
		}
//		public  void show(int a,int b)
//		{
//			System.out.println("Hi "+a);
//			System.out.println("Hi "+b);
//		}
	}
	
	public class kirantest3 {
		public static void main(String arg[]) 
		{
			kirantest5 k5 =new kirantest5();
			k5.show(3.0,5);
		}

		
	}
