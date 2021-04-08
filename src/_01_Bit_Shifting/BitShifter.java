package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4; //0100
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted); //1000
		
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		// Shifts the bits of the number to the left
		
		// 4. Try shifting num 3 places.
		int numThreeShift = num << 3;
		System.out.println(numThreeShift); //100000
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
