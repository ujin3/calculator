package ru.chibisov.calc;

public class Calc {

	public static String add(int value1, int value2){
		return String.valueOf(value1 + value2);
	}
    public static String sub(int value1, int value2){
		return String.valueOf(value1 - value2);
	}
    public static String mult(int value1, int value2){
        return String.valueOf(value1 * value2);
    }
    public static String div(int value1, int value2){
        return String.valueOf(value1 / value2);
    }
}
