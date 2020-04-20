//Create a method called displayHighScorePosition
//it should a player name as a parameter, and a 2nd parameter as a position in the high score table
//You should display the players name along with a message like "managed to get into position" and the
//position they got and a further message "on the high score table".
//
//Create a second method called calculateHighScorePosition
//it should be sent one argument only, the player score
//it should return an int
//the return data should be
//1 if the score is > 1000
//2 if the score is > 500 and < 1000
//3 if the score is > 100 and < 500
//4 in all other cases
//call both methods and display the results of the following
//a score of 1500, 900, 400 and 50

package challanges;

import com.sun.security.auth.NTDomainPrincipal;

public class Methods {

	public static void main(String[] args) {
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Rachit", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("MJ", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("NK", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("MNL", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Tim", highScorePosition);
		
	}
	
	public static void displayHighScorePosition(String playername, int position) {
		
		
		System.out.println(playername + " managed to get into position '" +
		position + "' on the high score table. ");
		
	}
	
	public static int calculateHighScorePosition(int score) {
		
//		if (score >= 1000) { return 1; }
//		else if (score >= 500) { return 2; }
//		else if (score >= 100) { return 3; }
//		return 4;
		// OR
		// Removing multiple returns.
		
		int position = 4;
		if (score >= 1000) { 
			position = 1; 
		}
		else if (score >= 500) { 
			position = 2; 
		}
		else if (score >= 100) { position = 3; }
		return position; // this will always return 4, as rest condition is set in if-else block
	}

}
