package lectures;

public class Operators {

	public static void main(String[] args) {
		
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		
		int previousResult = result;
		System.out.println("Previous Result = "+previousResult);
		result = result - 1; // 3 - 1
		System.out.println("3 - 1 = "+result);
		System.out.println("Previous Result = "+previousResult);
		
		result = result * 10; //2 * 10
		System.out.println("2 * 10 = "+result);
		
		result = result / 5; //20 /5
		System.out.println("20 / 5 = "+result);
		
		result = result % 3; // 4%3
		System.out.println("4 % 3 = "+result);
		
		
		// Abbreviating Operators
		
		//result = result + 1;
		result++; // 1 + 1
		System.out.println("1 + 1 = "+result);
		
		result--;
		System.out.println("2 - 1 = "+result);
		
		// result = result + 2;
		result += 2;
		System.out.println("1 + 2 = "+result);

		// result = result * 10;
		result *= 10;
		System.out.println("3 * 10 = "+result);
		
		// result = result / 10;
		result /= 10;
		System.out.println("30 / 10 = "+result);
		
		// result = result - 2;
		result -= 2;
		System.out.println("3 - 2 = "+result);
		
		boolean isAlien = false;
		if (isAlien == true)// toggle the value to true/false to see the output
			System.out.println("It is not an Alien.");
		System.out.println("And I'm scared of Alien.");
		// = assignment Operator
		// == equal/evaluate Operator
		
		//Now with Code Block
		boolean isAliens = false;
		if (isAliens == false) {// toggle the value to true/false to see the output
			System.out.println("It is not an Alien.");
		System.out.println("And I'm scared of Alien.");
		}
		
		int topScore = 80;
		if (topScore != 100) { //toggle between "==" and "!=" to see the changes
			System.out.println("You got the high score!");
		}
		
		int topScore1 = 100;
		if (topScore1 <= 100) { //toggle between ">", "<", "<=" and ">=" to see the changes
			System.out.println("You got the high score!");
		}
		
		int secondTopScore = 60;
		if (topScore > secondTopScore && topScore < 100 ) {
			System.out.println("Greater than 2nd topscore and less than 100");
		}
		
		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true.");
		}
		
		// (= vs ==)
		int newValue = 50;
		if (newValue == 50) { // this statement is expecting an int value, but considering it as boolean.
			// because with 'if' are not assigning a value, we are testing a condition
			//here we're using assignment operator not equal operator hence the error.
			// toggle between = and == to see the changes
			System.out.println("This is an error");
		}
		
		boolean isCar = false;
		if (isCar == true) { // this is not showing any error b/c we are already using the
			//expected type which is boolean. But this is logically not correct.
			System.out.println("This is not supposed to happen");
		}
		
		boolean isbike = false;
		if (isbike == true) { 
			System.out.println("This is not supposed to happen");
		}// Now no output as expected
		
		//Other ways
		boolean iscycle = false;
		if (iscycle) { //by default considered true
			System.out.println("This is not supposed to happen");
		}
		
		boolean isbird = false;
		if (isbird) {
			System.out.println("This is not supposed to happen bird");
		}
		
//		 Ternary Operator ? :
		isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}
	}

}