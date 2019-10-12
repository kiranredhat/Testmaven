package SmallPrograms;

import java.util.Scanner;

public class ReverseString {
	@SuppressWarnings("resource")
	public static void main (String [] args) {
		String original, reverse="";
		int length;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your Username To Revise");
		original = scanner.nextLine();
		length =original.length();
		for (int i=length -1; i>=0; i--)
		reverse = reverse + original.charAt(i);
		System.out.println("Your Revise String is: " +reverse);
}
}
