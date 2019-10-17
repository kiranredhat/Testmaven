package SmallPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {

		HashMap<String, String> mp=new HashMap<String,String>();
		mp.put("KiranKey1", "KiranValue1");
		mp.put("KiranKey2", "KiranValue2");
		mp.put("KiranKey3", "KiranValue3");
		
//		Method 1
		System.out.println("-------------------------------------------------------------------------------------------------");
	System.out.println("Method 1");

		for (Entry<String, String> entry:mp.entrySet())
		{
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
//		Method 2
		System.out.println("-------------------------------------------------------------------------------------------------");
	System.out.println("Method 2");

		for(String name:mp.keySet())
		{
			System.out.println("key is " +name);
		}
		for (String name2:mp.values())
		{
			System.out.println("value is " +name2);

		}
		
//		Method 3
		System.out.println("-------------------------------------------------------------------------------------------------");
	System.out.println("Method 3");
	
		Iterator<Entry<String,String>> itr=mp.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String,String>entry=itr.next();
			System.out.println("key= "+entry.getKey()+" , Value= " +entry.getValue());
		}
		
//		Method 4
		System.out.println("-------------------------------------------------------------------------------------------------");
	System.out.println("Method 4");
	
	mp.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
	

		
		
		
	}

}
