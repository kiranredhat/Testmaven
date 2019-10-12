package SmallPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CounterChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String original="NaveenSelenium";
char[]carr=original.toCharArray();
StringBuilder sb= new StringBuilder();
Map<Character,Integer> mp=new LinkedHashMap<Character,Integer>();
for (int i=0;i<carr.length; i++) 
{
	if (mp.containsKey(carr[i]))
	{
		int count=1;
		count =mp.get(carr[i]);
		count++;
		mp.put(carr[i], count);
	}
	else
	{
		mp.put(carr[i], 1);
	}
}
   	mp.forEach((key,value)->sb.append(key+""+value +" "));
   	System.out.println(sb);
		
	}

}
