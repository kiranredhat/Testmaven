package SmallPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13452;
		ArrayList<Integer> al= new ArrayList <Integer>();
		int no;
		int sum = 0;
		while (num>0)
		{
			al.add(num%10);
			num=num/10;
			
		}
		Collections.sort(al);
		System.out.println(al.size());
		
		for (Integer numval:al)
		{
			sum=sum+numval;
		}
			System.out.println(sum);	
				
				

	}

}
