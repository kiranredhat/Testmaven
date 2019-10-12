package SmallPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;


public class kirann {
	public static String kirannn;
public static void main(String[] args) {
String s= "AaCbBc";
String scap=s.replaceAll("[^A-Z]", "");//Accept only these value
String ssmall=s.replaceAll("[^a-z]", "");
//System.out.println(scap);
//System.out.println(ssmall);
StringBuilder sb=new StringBuilder();
char[]caparr=scap.toCharArray();
Arrays.sort(caparr);
char[]smarr=ssmall.toCharArray();
Arrays.sort(smarr);
HashedMap<Character, Character> mp=new HashedMap<Character,Character>();

for (int i=0;i<=caparr.length-1;i++) {
for (int j=0;j<=smarr.length-1;j++) {

mp.put(caparr[i] , smarr[j]);
}
}
for (Map.Entry<Character, Character> entry: mp.entrySet())
{
	System.out.print(entry.getKey() +entry.getValue());
}
}
}