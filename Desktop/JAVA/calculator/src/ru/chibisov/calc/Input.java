package ru.chibisov.calc;

import java.util.Scanner;

public class Input {

	public Input(){
		//
	}

	public String getConsoleInput(){
		Scanner consoleIn = new Scanner(System.in);
		System.out.println("Введите пример в формате: Операнд1 знак_операции Операнд2");
		String input = consoleIn.nextLine();
		return input.toUpperCase();
	}
}
