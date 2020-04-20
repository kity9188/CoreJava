package lectures;

public class Methods5 {
	
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
	
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // Declare variables here
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus); //finalScore is a local variable
			finalScore += 1000;
			System.out.println("Your final score was : " + finalScore);
		}
		
	}

}