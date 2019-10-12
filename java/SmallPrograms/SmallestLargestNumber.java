package SmallPrograms;

import java.util.Arrays;

public class SmallestLargestNumber {

	public static void main(String[] args) {
int number[]= {1,5,10,20,100};
int largest =number[0];
int smallest=number[0];
for (int i=1; i<number.length;i++) {	
	if (number[i]>largest) {
		largest=number[i];
	}else 
		if (number[i]<smallest) {
			smallest=number[i];
		}
	}
	
System.out.println("Given array is::" +Arrays.toString(number));
	System.out.println("Largest Number"+ largest);
	System.out.println("Smallest Number"+ smallest);
	}

}
