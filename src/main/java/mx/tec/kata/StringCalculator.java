package mx.tec.kata;

import java.util.ArrayList;
import java.util.List;

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
		List<String> negativeNumbers = new ArrayList<String>();

		for (String numString : arrayNumbers) {
			if (numString.startsWith("-")) {
				negativeNumbers.add(numString);
			}
			sum += Integer.parseInt(numString);
		}
		
		if (!negativeNumbers.isEmpty()) {
			String negativeNumbersString = negativeNumbers.toString();
			throw new UnsupportedOperationException("Negatives not allowed: " + negativeNumbersString.substring(1, negativeNumbersString.length() - 1));
		}

		return sum;
	}

}
