/**Challenge**
 * 1. Create a double variable with a value of 20.00.
 * 2. Create a second variable of type double with the value 80.00.
 * 3. Add both numbers together and multiply by 100.00.
 * 4. Use the remainder operator to figure out what the remainder from the result of
 * 	  the operation in step 3 and 40.00.
 * 	  We used the modulus or remainder operator on ints, but we can also use it on double.
 * 5. Create a boolean variable that assigns the value true if the remainder( %) in #4 is 0,
 *    of false if it is not zero.
 * 6. Output the boolean variable.
 * 7. Write an 'if-then' statement that displays a message "Got some remainder" if the boolean
 *    in #5 is not true. 
 * 
 */
package challanges;

public class OperatorsChallange {

	public static void main(String[] args) {
		
		double firstValue = 20.00d;
		double secondVariable = 80.00d;
		double operation = (firstValue + secondVariable) * 100.00d; 
		//if not using parenthesis, then operator precedence will follow
		System.out.println(operation);
		double remainder = operation % 40.00d;
		System.out.println(remainder);
		boolean output = (remainder == 0) ? true : false; ///// HIGHLIGHTED pay attention
		System.out.println(output);
		if (!output) {
			System.out.println("Got Some Remainder!!!");
		}
		/*
		 * if(remainder == 0) { output = true; }
		 * else { output = false; } 
		 * boolean finalOutput = output? true : false;
		 * if (!finalOutput) { System.out.println("Got Some Remainder!!!"); }
		 */
	}

}
