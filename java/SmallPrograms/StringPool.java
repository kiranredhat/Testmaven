package SmallPrograms;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Selenium";
		String y = new String("Selenium");
		String z = new String("Automation");

		if (x==y){
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		if (x.equals(y)){
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		
		x.compareTo(y);
		x.compareTo(z);

	}

}
