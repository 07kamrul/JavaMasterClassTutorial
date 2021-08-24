package RAF;

public class ConvertLowerCase {

	public static void main(String[] args) {
		String s = " Welcome! to Geeksforgeeks Planet. ";

		String lowerTrim = s.toLowerCase().trim();
		System.out.println("Lower case with team: " + lowerTrim);

		String removeSpace = lowerTrim.replaceAll("\\s", "");
		System.out.println("Remove Space: " + removeSpace);

	}

}
