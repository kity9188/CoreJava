package challanges;

public class DecimalComparator {

	public static void main(String[] args) {
		
		areEqualByThreeDecimalPlaces(-3.1756, -3.175);
		areEqualByThreeDecimalPlaces(3.175, 3.176);
		areEqualByThreeDecimalPlaces(3.0, 3.0);
		areEqualByThreeDecimalPlaces(-3.123, 3.123);

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double ab, double bc) {
		
		if ((int)(ab * 1000) == (int)(bc * 1000)) {
			System.out.println("True");
			return true;
		}
		else {
			System.out.println("False");
			return false;
		}
		
	}

}
