package SmallPrograms;

public class ThisKeyword {
	int i;
	public void parent(int i)
	{
		this.i=i;
		
		System.out.println("Value of i is "+i);
	}
	
	public void child ()
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKeyword tk= new ThisKeyword();
tk.parent(10);
tk.child();
	}

}
