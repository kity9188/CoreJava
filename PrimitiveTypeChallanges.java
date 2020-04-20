/********************************
 * Create a byte variable and set it to any valid byte number,
 * it doesn't matter. Create a short variable and set it to any valid short number.
 * 
 * Create an int variable and set it to any valid int number. Lastly, create a variable
 *  of type long and make it equal to 50000 plus 10 times the sum of byte plus the short
 *  plus integer values.
 **************************************/

package challanges;

public class PrimitiveTypeChallanges {

	public static void main(String[] args) {
		
		byte myByteVariable = Byte.MAX_VALUE;
		short myShortVariable = Short.MAX_VALUE;
		
		int myIntVariable = 1000;
		
		long myLongVariable = (50000L + (10L * (myByteVariable + myShortVariable + myIntVariable)));
		
		System.out.println(myLongVariable);
		
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		
		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		System.out.println(longTotal);
		
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		//Type Casting
		System.out.println(shortTotal);
	}

}
