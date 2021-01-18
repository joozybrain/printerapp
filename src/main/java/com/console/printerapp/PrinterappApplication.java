package com.console.printerapp;

import com.console.printerapp.service.InputService;
import com.console.printerapp.service.PrinterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;
import java.util.List;

@SpringBootApplication
public class PrinterappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PrinterappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		InputService inputService = new InputService();

		Console console = System.console();
		System.out.println("This program accepts only X,Y,Z,A,U followed by the font size 3 to 21 only.");
		System.out.println("Example: X 21 or Z 9");
		String userInputs = console.readLine("Please enter your inputs: ");

		List<String> checked = inputService.checkInputs(userInputs);
		while (checked.size() > 0) {
			System.out.println(checked);
			userInputs = console.readLine("Please enter your inputs: ");
			checked = inputService.checkInputs(userInputs);
		}

		PrinterService.getPrinter(inputService.PRINTER_TYPE, inputService.FONT_SIZE);

	}

}
