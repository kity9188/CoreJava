package lectures;

public class ByteShortIntLong {

	public static void main(String[] args) {
		
		System.out.println("Int");
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		
		System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
		//OVERFLOW. becz technically it's not possible. Somehow it will be adjusted by the compiler see a -ve sign.
		System.out.println("Busted Min Value = " + (myMinIntValue - 1));
		//UNDERFLOW.
		
		//OVERFLOW: in case of max value.
		//UNDERFLOW: in case of min value.
		
		int maxIntValue = 2_147_483_647; //this is the max int value. increase or decrease it to see the error.
		//here we'll get error because we'll be changing it literally.
		System.out.println(myValue);
		System.out.println(maxIntValue);
		
		System.out.println("\nByte");
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Min Value = " + myMinByteValue);
		System.out.println("Byte Max Value = " + myMaxByteValue);
		
		System.out.println("\nShort");
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Min Value = " + myMinShortValue);
		System.out.println("Short Max Value = " + myMaxShortValue);
		
		System.out.println("\nlong");
		
		long mylongValue = 100L; //Representation of a long value
		System.out.println(mylongValue);
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Short Min Value = " + myMinLongValue);
		System.out.println("Short Max Value = " + myMaxLongValue);
		long bigLongLitralValue = 2_147_483_647L; // If we don't type L, it will be taken as integer
		System.out.println("Big long litral value = "+ bigLongLitralValue);
	}

}

