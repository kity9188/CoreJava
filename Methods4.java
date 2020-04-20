package lectures;

public class Methods4 {
	
	public static void main(String[] args) {
				
		calculateScore(true, 800, 5, 100); // Pass values here
		calculateScore(true, 10000, 8, 200);

	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // Declare variables here
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus); //finalScore is a local variable
			finalScore += 3000;
			System.out.println("Your final score was : " + finalScore);
		}
		
	}
	
}
