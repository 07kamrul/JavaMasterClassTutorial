package ControlFlowStatements;

public class SwitchStatement {

	public static void main(String[] args) {
//		int value = 3;
//		if (value == 1) {
//			System.out.println("Value was 1");
//		} else if (value == 2) {
//			System.out.println("Value was 2");
//		} else {
//			System.out.println("Value was 3");
//		}

		int switchValue = 3;
		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;

		case 2:
			System.out.println("Value was 2");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("Value was a 3, or a 4, or a 5");
			break;

		default:
			System.out.println("Value was not 1 or 2");
			break;
		}

		char charValue = 'D';
		switch (charValue) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found");
			break;
		case 'C':
		case 'D':
		case 'E':
			System.out.println("C, D, E was found");
			break;
		default:
			System.out.println("Could not find A, FB, C, D, or E");
			break;
		}

		String month = "JANUary";
		switch (month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "february":
			System.out.println("Feb");
			break;
		case "march":
			System.out.println("Mar");
			break;

		default:
			System.out.println("not sure");
			break;
		}

	}

}
