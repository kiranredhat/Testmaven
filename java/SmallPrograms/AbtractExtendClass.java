package SmallPrograms;

public class AbtractExtendClass extends AbtractClass {

	public void TestOne() {
	System.out.println("This is extended class");
	}
	public void TestTwo() {
		System.out.println("This is AbtractExtendedClass TestTwo Method");
	}
	@Override
	public void TestThree() {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbtractExtendClass aec= new AbtractExtendClass();
		aec.TestOne();
		aec.TestTwo();
	}




}
