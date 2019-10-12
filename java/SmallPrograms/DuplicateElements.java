package SmallPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
public static void main(String[] args) {
	String a[]= {"Kiran","Manik","Kiran","Gaikwad"}; 
	
	ArrayList<String> names= new ArrayList<>(Arrays.asList(a));
			
	Set <String> st= new HashSet<>();
	for(String name: names)
	{
		if(st.add(name)==false)
		{
			System.out.println(name);
		}
	}
}
}
