package lectures;

public class Methods3 {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		calculateScore(true, 800, levelCompleted, bonus); // Pass values here
		calculateScore(true, 10000, 8, 200);

	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // Declare variables here
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus); //finalScore is a local variable
			finalScore += 2000;
			System.out.println("Your final score was : " + finalScore);
		}
		
	}
	
}
