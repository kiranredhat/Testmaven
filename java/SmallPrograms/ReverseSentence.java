package SmallPrograms;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original= "The Selenium Java";
		String[] str=original.split(" ");
		int len= str.length;
		String rev="";
		for(int i =len-1;i>=0; i--)
		{
			rev=rev+str[i]+" ";
		}
		System.out.print(rev );
				

	}

}
