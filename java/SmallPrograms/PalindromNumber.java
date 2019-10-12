package SmallPrograms;
//151,121
public class PalindromNumber {
public static void isPalindromNumber(int num) {
System.out.println("Given Number is::"+ num);
	int r=0;
	int sum=0;
	int t;
	t=num;
	while (num>0) 
	{
		r= num % 10; //1
		sum=(sum*10)+r; // 151
		num=num/10;// 1
	}
if (t==sum) {
	System.out.println("Palindrom Number");
}else {
	System.out.println("Not Palindrom Number");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindromNumber(152);
	}

}
