package SmallPrograms;

public class StaticKeword {
	static int count =0;
	
	 StaticKeword(){
		count++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticKeword();
		new StaticKeword();
		System.out.println("Total Obj is " +count); 
	}

}
