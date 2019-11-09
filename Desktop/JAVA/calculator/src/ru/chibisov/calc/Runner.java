package ru.chibisov.calc;

public class Runner {

	public static void main(String[] args) {
		Input input  = new Input();
		String line = input.getConsoleInput();
		if ((line != null) && (!line.isEmpty())){
			String[] parts = line.split(" ");
			Operation operation = Operation.getInstance(parts);
			String result = "?";
			switch (operation.getAction()){
                case "+":
                    result = Calc.add(operation.getOperand1(), operation.getOperand2());
                    break;
                case "-":
                    result = Calc.sub(operation.getOperand1(), operation.getOperand2());
                    break;
                case "*":
                    result = Calc.mult(operation.getOperand1(), operation.getOperand2());
                    break;
                case "/":
                    result = Calc.div(operation.getOperand1(), operation.getOperand2());
                    break;
                default:
                    throw new IllegalArgumentException("Неизветная операция");
            }
            System.out.println(result);
        }
	}
}
