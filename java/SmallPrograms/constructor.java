package SmallPrograms;

public class constructor {

public constructor()
{
	int a =5;
	System.out.println("FirstConstructor");
}

public constructor(int a)
{int b=5;
	System.out.println("SecondConstructor");
}

public constructor(int b, int c)
{
	System.out.println("ThirdConstructor");
}

public static void main(String[]args){
	constructor C=new constructor();
	constructor C1=new constructor(6);
	constructor C2=new constructor(6,7);
}

}
