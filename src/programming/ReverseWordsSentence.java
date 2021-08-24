package programming;

import java.util.Stack;

public class ReverseWordsSentence {

	public String reverseWord(String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}

		String reverse = "";
		String temp = "";

		while (!stack.isEmpty()) {

			if (Character.isLetter(stack.peek())) {
				temp = temp + stack.pop();
			} else {
				reverse = " " + temp + reverse;
				temp = "";
				stack.pop();
			}
		}
		if (temp != "") {
			reverse = temp + reverse;
		}
		return reverse;
	}

	public static void main(String[] args) {

		String str = "Hello world";

//		This is dynamically input if your want to dynamically please remove comment this block section

//		Scanner inputString = new Scanner(System.in);
//		System.out.println("Enter your string: ");
//
//		String str = inputString.nextLine();

		ReverseWordsSentence obj = new ReverseWordsSentence();
		System.out.println("Reverse words in sentence is : " + obj.reverseWord(str));
	}

}