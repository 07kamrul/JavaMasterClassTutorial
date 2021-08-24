package Operators;

public class SubString {

	public static void main(String[] args) {
		String s = "121021";
		String ag = s.substring(0, 1);
		String ap = s.substring(1, 2);
		String op = s.substring(2, 3);
		String ui = s.substring(3, 5);
		String ac = s.substring(5, 6);
		String aPaG = s.substring(0, 2);

		System.out.println("Full code: " + s);
		System.out.println("App Group Code: " + ag);
		System.out.println("App Code: " + ap);
		System.out.println("Operation Code: " + op);
		System.out.println("UI Code: " + ui);
		System.out.println("Action Code: " + ac);
		System.out.println("App Group App Code: " + aPaG);

		System.out.println("------------------------------------------");
		String a = "Shout Incident";
		String b[] = a.split(" ");
		String c = "";
		for (int i = 0; i < b.length; i++) {
			c += b[i].trim() + "_";
		}
		System.out.println(c.substring(0, c.length() - 1));

	}

}
