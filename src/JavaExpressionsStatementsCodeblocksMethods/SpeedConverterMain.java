package JavaExpressionsStatementsCodeblocksMethods;

public class SpeedConverterMain {
	public static void main(String[] args) {
		long miles = SpeedConverter.toMilesPerhour(10.5);
		System.out.println("Miles = " + miles);

		SpeedConverter.printConversion(10.5);
	}

}
