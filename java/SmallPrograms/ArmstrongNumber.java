package SmallPrograms;
//Given number is153=
//1*1*1=1
//5*5*5=125
//3*3*3=27
//Total=153
//So this is armstrong number

public class ArmstrongNumber {
public static void isArmstrongNumber (int num) {
	int cube=0;
	int r;
	int t;
	t=num;
	while (num>0) {
	r=num % 10;
	num =num / 10;
	cube = cube + (r*r*r);
}
	if (t==cube) {
		System.out.println("Armstrong Number");
	}else {
		System.out.println("Not Armstrong Number");
	}
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstrongNumber(153);
	}

}
