package SmallPrograms;


	 class parent
	{
		int i=20;
		public void show()
		{
			System.out.println("Parent");
		}
		void parent()
		{
			System.out.println("Constructor");
		}
	}
	
	 class child extends parent
	{
		 public void m1()
		 {
			 int i=10;
				System.out.println(i);
				System.out.println(super.i);
				super.show();
				super.parent();
		 }
		
	}
	public class SuperKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
child ch=new child();
ch.m1();
	}

}
