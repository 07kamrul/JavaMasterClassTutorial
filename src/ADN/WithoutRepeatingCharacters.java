package ADN;

public class WithoutRepeatingCharacters {

	public static int longestUniqueSubsttr(String str) {
		int res = 0;

		for (int i = 0; i < str.length(); i++) {

			boolean[] visited = new boolean[256];

			for (int j = i; j < str.length(); j++) {

				if (visited[str.charAt(j)] == true)
					break;

				else {
					res = Math.max(res, j - i + 1);
					visited[str.charAt(j)] = true;
				}
			}

			visited[str.charAt(i)] = false;
		}
		return res;
	}

	public static void main(String[] args) {
		String str = "abcabcab";
//		String str = "bbbbbbbbbb";

		System.out.println("Longest substring without repeating characters is: " + longestUniqueSubsttr(str));
	}

}
