package challanges;

public class BarkingDog {

	public static void main(String[] args) {
		
		shouldWakeUp(true, 1);
		shouldWakeUp(false, 2);
		shouldWakeUp(true, 8);
		shouldWakeUp(true, -1);

	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		
		if(barking) {
			if (hourOfDay > 0 && hourOfDay < 24) {
				if (hourOfDay < 8 || hourOfDay > 22) {
					System.out.println("Wake Up");
					return true;
				}
				else {
					System.out.println("Not after 8 and before 22");
					return false;
				}
			}
			else {
				System.out.println("Invalid hour");
				return false;
			}
		}
		else {
			System.out.println("Dog is not barking");
			return false;
		}
		
	}
	
	
//	public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
//		if(hourOfDay>0 && hourOfDay <24) {
//			if(barking) {
//				if (hourOfDay < 8 || hourOfDay > 22) {
//					System.out.println(barking + " at " + hourOfDay+" Wake Up!!!");
//					return true;
//				}
//				else {
//					System.out.println("Dog is not barking");
//					return false;
//				}
//			}
//		}
//		System.out.println("Day time");
//		return false;
//	
//	}

}
