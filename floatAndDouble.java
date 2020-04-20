package lectures;

public class floatAndDouble {

	public static void main(String[] args) {
	
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Min Value = "+myMinFloatValue);
		System.out.println("Float Max Value = "+myMaxFloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("double Min Value = "+myMinDoubleValue);
		System.out.println("double Max Value = "+myMaxDoubleValue);
		
		int myIntValue = 5;
		float myFloatValue = 5f;
		double myDoubleValue = 5d;
		System.out.println("int = "+myIntValue);
		System.out.println("float = "+myFloatValue);
		System.out.println("double = "+myDoubleValue);
		
		//float myNewFloatValue = 5.25; //=> This will give error
		//because by default every deciaml value is considered double.
		//if we want to use it as float, we need to use 'f' as suffix.
		double myNewDoubleValue = 5.25d;
		System.out.println(myNewDoubleValue);
		
		//trying Casting
		float myCastFloatValue = (float) 5.25;
		//it is generally not recommended to use cast for float like this.
		double myCastDoubleValue = 5.25d;
		System.out.println("Float Casting"+myCastFloatValue);
		System.out.println("Double"+myCastDoubleValue);
		
		int divIntValue = 5/3;
		//float div1FloatValue = (5 / 3)f; //This will give error, invalid
		float divFloatValue = 5f / 3f;
		//double divDoubleValue = 5d /3d;
		//As double is being used by default, we can keep it simple as below
		double divDoubleValue = 5.00 /3.00;
		double div1DoubleValue = 5 /3;
		System.out.println("int = "+divIntValue);
		System.out.println("float = "+divFloatValue);
		System.out.println("double = "+divDoubleValue);
		System.out.println("double1 = "+div1DoubleValue);
	}

}
