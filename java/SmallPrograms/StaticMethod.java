package SmallPrograms;

class C1
{
	int i;
	static String name = "EEC";
	static void update()
	{
		name="EEC class";
	}
	void display()
	{
		System.out.println(name);
	}
	
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1.update(); //this updates the static keyword. Also we no need to create object to call the method
		C1 obj= new C1();
		obj.display();
		
	}

}
