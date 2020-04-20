package lectures;

public class IfKeyWordAndCodeBlocks {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(score == 4000) {
			System.out.println("1.Your score was 5000");
		}
		System.out.println("1.This was executed");
		
		if(score == 4000) 
			System.out.println("2.Your score was 5000");
		
		System.out.println("2.This shouldn't execute");
		
		if(score == 4000) {
			System.out.println("3.Your score was 5000");
			System.out.println("3.This shouldn't execute");
		}
		
		if(score == 5000) {
			System.out.println("4.Your score was 5000");
		}
		System.out.println("4.This was executed right");
		
		if(score < 5000) {
			System.out.println("5.Your score was less than 5000");
		} else {
			System.out.println("5.Got here");
		}
		
		if(score <= 5000) {
			System.out.println("6.Your score was less than 5000");
		} else {
			System.out.println("6.Got here");
		}
		
		if(score < 5000 && score > 1000) {
			System.out.println("7.Your score was less than 5000 but greater than 1000");
		} else if (score < 1000) {
			System.out.println("7. Your score was less than 1000");
		} 
		else {
			System.out.println("7.Got here");
		}
		
		System.out.println("<------------------------>");
		
//		boolean gameOver = true;
		score = 800;
//		int levelCompleted = 5;
//		int bonus = 100;
		
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus); //finalScore is a local variable
			System.out.println("Your final score was : " + finalScore);
		}
		
		// Challenge
		//Print out a second score on the screen with the following
		//score set to 10000
		//levelCompleted set to 8
		//bonus set to 200
		//But make sure the first printout above still displays well
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was : " + finalScore);
		}

	}

}
