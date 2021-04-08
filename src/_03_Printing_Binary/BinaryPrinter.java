package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method! Use the main method to test
	 * your methods.
	 */

	public void printByteBinary(byte b) {
		// We first want to print the bit in the one's place

		// Shift b seven bits to the right
		for (int i = 7; i >= 0; i--) {
			int shiftedByte = b >> i;

			// Use the & operator to "mask" the bit in the one's place
			// This can be done by "anding" (&) it with the value of 1

			// Print the result using System.out.print (NOT System.out.println)
			System.out.print(shiftedByte & 1);

			// Use this method to print the remaining 7 bits of b
		}
	}

	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte b1;
		byte b2;

		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		b1 = (byte) ((s >> 8) & 255);
		b2 = (byte) (s & 255);

		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(b1);
		printByteBinary(b2);
	}

	public void printIntBinary(int i) {
		// Create 2 short variables
		short s1;
		short s2;

		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		s1 = (short)((i >> 16) & 0b1111111111111111);
		s2 = (short)(i & 0b1111111111111111);

		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(s1);
		printShortBinary(s2);
	}

	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int i1;
		int i2;
		
		i1 = (int)((l >> 32) & 0b11111111111111111111111111111111);
		i2 = (int)(l & 0b11111111111111111111111111111111);
		
		printIntBinary(i1);
		printIntBinary(i2);
	}

	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter bp = new BinaryPrinter();

		byte b = 93;
		bp.printByteBinary(b);
		System.out.println();
		
		short s = 9673;
		bp.printShortBinary(s);
		System.out.println();
		
		int i = 484032912;
		bp.printIntBinary(i);
		System.out.println();
		
		long l = 484032912948320247L;
		bp.printLongBinary(l);
		
	}
}
