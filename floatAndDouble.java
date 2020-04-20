/***************
 * Convert a given number of pounds to kilogram
 * STEPS:
 * 1. Create a variable with the appropriate type to store the number of pounds
 *    to be converted to kilograms.
 * 2. Calculate the result i.e., the number of kilograms based on the contents of
 *    the variable above and store the result in second appropriate variable.
 * 3. Print out the result.
 * HINT: 1 pound = 0.45359237 kilogram.
 ****************/

package challanges;

public class floatAndDouble {

	public static void main(String[] args) {
		
		double myPoundNumber = 200d;
		double myKilogram = myPoundNumber * 0.45359237d;
		System.out.println(myPoundNumber+" Pounds = "+myKilogram);
	}

}
