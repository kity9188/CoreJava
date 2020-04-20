package lectures;

public class CharAndBoolean {

	public static void main(String[] args) {
		
		char myChar = 'D';
		char myUnicodeChar = '\u0044';
		System.out.println(myChar);
		System.out.println(myUnicodeChar);
		
		char myCopyrightChar = '\u00A9';
		System.out.println(myCopyrightChar);
		
		System.out.println("\nBoolean");
		
		boolean myTrueBooleanValue = true;
		boolean myFalseBooleanValue = false;
		
		boolean isCustomerOver21 = true;
		
		//System.out.println(myTrueBooleanValue, myFalseBooleanValue, isCustomerOver21);
	}

}
