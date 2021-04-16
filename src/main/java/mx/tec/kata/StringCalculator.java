package mx.tec.kata;

public class StringCalculator {
	
	public int add(String numbers) {

		if (numbers.isBlank()) {
			return 0;
		}

		int sum = 0;
		String[] arrayNumbers = numbers.split("\\n|,");

		for (String numString : arrayNumbers) {
			sum += Integer.parseInt(numString);
		}
		

		return sum;
	}

}
