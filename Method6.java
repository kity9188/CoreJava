// void means don't send any value back. If want to return anything, need to use that type
// of data type instead of 'void'


package lectures;

public class Method6 {
	
	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		calculateScore(gameOver, score, levelCompleted, bonus);
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		calculateScore(gameOver, score, levelCompleted, bonus);
		

	}
	
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		// return type int
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus); //finalScore is a local variable
			finalScore += 2000;
			System.out.println("Your final score was : " + finalScore);
			return finalScore; //if we just use this, will produce error
			// as this is a local variable, hence will not return any value out of this
			// code block.
		} 
		//else {return -1;} // So we can use this 'else'
		//or
		return -1;
		// In programming terms, -1 is conventionally used to indicate an error
		// In searching algorithms, -1 indicates an invalid value or value not found
	}
	
}
