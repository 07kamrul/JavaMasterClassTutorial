package JavaExpressionsStatementsCodeblocksMethods;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println("New score is " + newScore);
		calculateScore(80);
		calculateScore(100, 50, 65);
		calculateScore();
		double centimeters = calcFeetAndInchesToCentimeters(0, -10);
		if (centimeters < 0.0) {
			System.out.println("Invalid parameter");
		}

		calcFeetAndInchesToCentimeters(157);
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " score " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unnamed player score " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score1, int score2, int score3) {
		System.out.println("Unnamed player score " + score1 + " , " + score2 + " , " + score3 + " points");

		int totalScore = score1 + score2 + score3;
		return totalScore;
	}

	public static int calculateScore() {
		System.out.println("No player name, no player score");
		return 0;
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if ((feet < 0) || ((inches < 0) && (inches > 12))) {
			System.out.println("Invalid feet or inches perameter");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches " + centimeters + " cm");
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}

		double feet = (int) inches / 12;
		double remaingInches = (int) inches % 12;

		System.out.println(inches + " inches is equal to " + feet + " feet and " + remaingInches + "inches");
		return calcFeetAndInchesToCentimeters(feet, remaingInches);
	}

}
