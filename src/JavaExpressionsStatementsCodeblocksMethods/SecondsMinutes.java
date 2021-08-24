package JavaExpressionsStatementsCodeblocksMethods;

public class SecondsMinutes {

	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args) {
		System.out.println(getDurationsString(65, 45));
		System.out.println(getDurationsString(3945L));
		System.out.println(getDurationsString(-41));
		System.out.println(getDurationsString(65, 9));

	}

	private static String getDurationsString(long minutes, long seconds) {

		if (minutes < 0 || (seconds < 0) || (seconds > 59)) {
			return "Invalid value";
		}

		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;

		String hourString = hours + "h";
		if (hours < 10) {
			hourString = "0" + hourString;
		}

		String minutesString = remainingMinutes + "m";
		if (remainingMinutes < 10) {
			minutesString = "0" + minutesString;
		}

		String secondsString = seconds + "s";
		if (seconds < 10) {
			secondsString = "0" + secondsString;
		}

		return hourString + " " + minutesString + " " + secondsString + "";
	}

	private static String getDurationsString(long seconds) {
		if (seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}

		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;

		return getDurationsString(minutes, remainingSeconds);
	}

}
