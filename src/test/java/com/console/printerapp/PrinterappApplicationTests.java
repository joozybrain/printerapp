package com.console.printerapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

class PrinterappApplicationTests {

	@Test
	public void checkUserInputs() {
		String inputs = "A21";
		String[] parsedInputs = new String[2];
		parsedInputs[0] = inputs.substring(0,1);
		parsedInputs[1] = inputs.substring(1);

		System.out.println(Arrays.toString(parsedInputs));

		Assertions.assertTrue(parsedInputs[0].length() == 1);
		Assertions.assertTrue(parsedInputs[1].length() == 2);

		inputs = "A9";
		parsedInputs[0] = inputs.substring(0,1);
		parsedInputs[1] = inputs.substring(1);
		System.out.println(Arrays.toString(parsedInputs));
		Assertions.assertTrue(parsedInputs[1].length() == 1);
	}

}
