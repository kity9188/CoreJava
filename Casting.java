package lectures;

public class Casting {

	public static void main(String[] args) {
		System.out.println("Type Casting in Java");
		
		int myMinIntValue = Integer.MIN_VALUE;
		
		int myTotal = (myMinIntValue / 2);
		
		//trying same with byte
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		//showing error "Type mismatch: cannot convert from int to byte"
		
		short myMinShortValue = Short.MIN_VALUE;
		short myNewShortValue = (short)(myMinShortValue /2);
		
		System.out.println(myTotal);
		System.out.println(myNewByteValue);
		System.out.println(myNewShortValue);
	}

}
