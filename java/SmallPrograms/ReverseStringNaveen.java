package SmallPrograms;

public class ReverseStringNaveen {

	public static void main(String[] args) {
// Method 1
String str= "Selenium";
String rev="";
int len=str.length();
for (int i= len-1; i >=0; i--) {
	rev = rev+str.charAt(i);
	
		}
System.out.println(rev);

//Method 2
StringBuffer str1 = new StringBuffer(str);
StringBuffer reverse=str1.reverse();
System.out.println(reverse);
	}

}
