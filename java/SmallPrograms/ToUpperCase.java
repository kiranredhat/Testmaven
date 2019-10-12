package SmallPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "abc123";
String b = "abc";
String k= a.toUpperCase();

String m= a.replaceAll("[^a-z]", "");
String l= a.replaceFirst(a, "kiran");
System.out.println(l);
String loginToken="[wdsd34svdf]";
System.out.println(loginToken.substring(1, loginToken.length()-1));

String s[]= {"kingkiran"};
System.out.println(Arrays.toString(s));
String h=Arrays.toString(s);
int length =h.length();

String r="";
for (int i=length -1;i>=0; i--)
	 r =r+h.charAt(i);
		System.out.println(r);
		
		List<String> crunchifyList = new ArrayList<String>();
		 
		// add 4 different values to list
		crunchifyList.add("eBay");
		crunchifyList.add("Paypal");
		crunchifyList.add("Google");
		crunchifyList.add("Yahoo");
		
		for (int i=0; i<crunchifyList.size(); i++) {
			System.out.println(crunchifyList.get(i));
			}
		Iterator <String> values= crunchifyList.iterator();
		while (values.hasNext()) {
			String tempvalue=values.next();
			System.out.println(tempvalue);
		}
		 Map<String,String> gfg = new HashMap<String,String>(); 
		  gfg.put("GFG", "geeksforgeeks.org"); 
	        gfg.put("Practice", "practice.geeksforgeeks.org"); 
	        gfg.put("Code", "code.geeksforgeeks.org"); 
	        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
	 //UsingForLoop
		for (Map.Entry<String, String> entry: gfg.entrySet())
			System.out.println(entry.getKey()+ entry.getValue());
		
		//Using Enhance forloop
        for (String name : gfg.keySet())  
        { 
            
            String url = gfg.get(name); 
            System.out.println("Key = " + name + ", Value = " + url); 
        } 
	}
}