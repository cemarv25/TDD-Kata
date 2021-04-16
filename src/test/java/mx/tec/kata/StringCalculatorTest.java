package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	StringCalculator calculator = new StringCalculator();

	@Test
	void givenCalculator_whenAddEmptyString_thenReturnZero() {
		int expectedResult = 0;
		String numbers = "";
		
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculator_whenAdd1_thenReturn1() {
		int expectedResult = 1;
		String numbers = "1";
		
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculator_whenAdd1Comma2_thenReturn3() {
		int expectedResult = 3;
		String numbers = "1,2";
		
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculator_whenAdd1_3_5_7_9_thenReturn25() {
		int expectedResult = 25;
		String numbers = "1,3,5,7,9";
		
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculator_whenAdd1NewLine2Comma3_thenReturn6() {
		int expectedResult = 6;
		String numbers = "1\n2,3";
		
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
}
