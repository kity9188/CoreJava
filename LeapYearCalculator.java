package challanges;

public class LeapYearCalculator {

	public static void main(String[] args) {
		
		isLeapYear(1700);
		isLeapYear(1800);
		isLeapYear(1900);
		isLeapYear(2100);
		isLeapYear(2200);
		isLeapYear(2300);
		isLeapYear(2500);
		isLeapYear(2600);
		
		isLeapYear(1600);
		isLeapYear(2000);
		isLeapYear(2400);
		
		isLeapYear(-1600);
		isLeapYear(2017);

	}
	
	public static boolean isLeapYear(int year) {
		
		if (year >= 1 && year <= 9999) {
			
			if ((year % 4 == 0)&&(year % 100 == 0)&&(year % 400 == 0)) {
				System.out.println("The year is a leap year. It has 366 days.");
				return true;
			}
			else {
				System.out.println("Not a Leap Year. It has 365 days.");
				return false;
			}
			
		}
		else {
			System.err.println("Invalid year");
			return false;
		}
		
	}

}
