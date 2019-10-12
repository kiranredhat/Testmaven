package SmallPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

Scanner SC = new Scanner(System.in);
System.out.println("Enter Your Number");

int number = SC.nextInt();

int fact=1;
for (int i=1  ; i<=number; i++) {
	fact=fact*i;
	System.out.println("Your Factorial of " +number+ " is= " +fact );

}
System.out.println("Your Factorial of " +number+ " is= " +fact );

	}

}

