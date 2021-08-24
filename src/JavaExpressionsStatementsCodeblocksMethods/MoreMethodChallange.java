package JavaExpressionsStatementsCodeblocksMethods;

public class MoreMethodChallange {

	public static void main(String[] args) {
		int heighScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim ", heighScorePosition);

		heighScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Bob ", heighScorePosition);

		heighScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Percy ", heighScorePosition);

		heighScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Gill ", heighScorePosition);

		heighScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Louise ", heighScorePosition);
	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(
				playerName + " managed to get into position " + highScorePosition + " on the heigh score table.");
	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore > 1000) {
			return 1;
		} else if (playerScore > 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore > 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}

	}
}
