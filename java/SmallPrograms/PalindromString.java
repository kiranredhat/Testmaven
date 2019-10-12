package SmallPrograms;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		int r=0;
		String original="KIK";
		int len=original.length();
		String t=original;
	
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		if (t.equals(rev))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is Not Palindrom");

		}

	}

}
