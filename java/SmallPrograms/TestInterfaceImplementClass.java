package SmallPrograms;

import org.testng.annotations.Test;

public class TestInterfaceImplementClass implements TestInterface {
	static int b=1;
	
	public TestInterfaceImplementClass(){
		System.out.println("This is TestInterfaceImplementClass constructor");
	}

	public void testOne() {
		// TODO Auto-generated method stub
		 int a=2;
		System.out.println("testOneMethod"+a);
	}

	public void testTwo() {
		// TODO Auto-generated method stub
		 int b=3;
		System.out.println("testTwoMethod "+b);

	}
public void testThree() {
}
	// TODO Auto-generated method stub
	
public static void main(String [] arg) {
	// TODO Auto-generated method stub

}

}
