package _05_Pseudo_RNG;

public class PseudoRNG {
	/*
	 * It is impossible for a computer to come up with a series of numbers 
	 * that are truly random. They can, however, use mathematical algorithms
	 * to generate numbers that can seem random. These are called pseudo random 
	 * numbers.
	 * 
	 */
	
	//1. Create a member variable of type long called "seed"
	long seed;
	
	//2. Make a constructor that initializes the memeber variable
	PseudoRNG(long seed){
		this.seed = seed;
	}
	
	//3. Complete the steps inside the xorShift method
	
	//4. Complete the steps in the main method
	
	//5. Write your own pseudo random generation method. You can use the xor
	//    shift as a guide. Use the main method to test it.
	long timeShift() {
		long milliseconds = System.currentTimeMillis();
		long seed = this.seed;
		long shiftedSeed = seed << 13;
		
		return milliseconds ^ shiftedSeed;
	}
	
	
	// This is called the xor shift. It is a very simple algorithm to generate
	// Pseudo random numbers. 
	long xorShift(){
		//1. Create a local long called seed and set it equal to the member variable 
		//   We will only use the local variable for the rest of the method
		long seed = this.seed;
		
		//2. Shift seed to the left 13 bits and save the result
		long shiftedSeed = seed << 13;
		
		//3. xor seed by the result of step 1 and save that result
		long xorSeed = seed ^ shiftedSeed;
		
		//4. Set seed equal to the result of step 2
		seed = xorSeed;
	
		//5. Shift seed to the right 7 bits and save the result
		shiftedSeed = seed >> 7;
		
		//6. xor seed by the result of step 4 and save that result
		xorSeed = seed ^ shiftedSeed;
				
		//7. Set seed equal to the result of step 5
		seed = xorSeed;
		
		//8. Shift seed to the left 17 bits and save the result
		shiftedSeed = seed << 17;
		
		//9. xor seed by the result of step 7 and save that result
		xorSeed = seed ^ shiftedSeed;
				
		//10. Set seed equal to the result of step 8
		seed = xorSeed;
		
		//11. change the line below to return seed
		return seed;
		
		//For fun, see if you can rewrite the method using only 4 lines of code
		// long seed = this.seed;
		// seed = seed ^ (seed << 13);
		// seed = seed ^ (seed >> 7);
		// return seed ^ (seed << 17);
	}
	
	
	
	public static void main(String[] args) {
	
		//1. Create a PseudoRNG object with any seed. 
		PseudoRNG rng1 = new PseudoRNG(48394820483213L);
		
		//2. Print the result of xorShift() 3 times and note the random numbers.
		System.out.println(rng1.xorShift());
		System.out.println(rng1.xorShift());
		System.out.println(rng1.xorShift());
		
		//3. Create a secon PSeudoRNG object with a different seed and print the result of xorShift 3 times.
		PseudoRNG rng2 = new PseudoRNG(940802840998430274L);
		
		//4. Run the tests a second time and notice that 3 random numbers are the same because the seed generates the same sequence of random numbers.
		System.out.println(rng2.xorShift());
		System.out.println(rng2.xorShift());
		System.out.println(rng2.xorShift());
		
		//If you would like to set the seed with a number that is hard to predict, you can use System.currentTimeMillis().
		System.out.println(rng1.timeShift());
		System.out.println(rng1.timeShift());
		System.out.println(rng1.timeShift());
		
		System.out.println(rng2.timeShift());
		System.out.println(rng2.timeShift());
		System.out.println(rng2.timeShift());
	}
}


