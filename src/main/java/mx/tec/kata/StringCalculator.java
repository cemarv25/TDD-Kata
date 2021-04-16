package mx.tec.kata;

public class StringCalculator {
	
	public int add(String numbers) {
		String delimiter = ",";
		String sanitizedNumbers = numbers;
		
		// Check if the string is empty
		if (numbers.isBlank()) {
			return 0;
		}
		
		// Check if the string contains a custom delimiter
		if (numbers.startsWith("//")) {
			delimiter = numbers.substring(2, 3);
			sanitizedNumbers = numbers.substring(4);
		}

		int sum = 0;
		String[] arrayNumbers = sanitizedNumbers.split("\\n|" + delimiter);

		for (String numString : arrayNumbers) {
			sum += Integer.parseInt(numString);
		}
		

		return sum;
	}

}
