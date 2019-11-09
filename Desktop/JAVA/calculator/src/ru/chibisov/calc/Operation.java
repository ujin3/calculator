package ru.chibisov.calc;

import java.util.HashMap;
import java.util.Map;

public class Operation {

    private static final Map<String, Integer> ROME_VALUES = new HashMap<>();

    static {
        ROME_VALUES.put("I", 1);
        ROME_VALUES.put("II", 2);
        ROME_VALUES.put("III", 3);
        ROME_VALUES.put("IV", 4);
        ROME_VALUES.put("V", 5);
        ROME_VALUES.put("VI", 6);
        ROME_VALUES.put("VII", 7);
        ROME_VALUES.put("VIII", 8);
        ROME_VALUES.put("IX", 9);
    }

    private int operand1;
    private int operand2;
    private String action;

    public static Operation getInstance(String[] parts) {
        if ((parts != null) && (parts.length == 3)) {
            Operation result = new Operation();
            result.operand1 = getOperand(parts[0]);
            result.operand2 = getOperand(parts[2]);
            result.action = getAction(parts[1]);
            return result;
        } else {
            throw new IllegalArgumentException("Некорректные входные данные");
        }
    }

    private static String getAction(String part) {
        if ((part != null) && (part.length() == 1) && ("+-*/".contains(part))) {
            return part;
        } else {
            throw new IllegalArgumentException("Некорректная операция");
        }
    }

    private static int getOperand(String part) {
        try {
            return Integer.parseInt(part);
        } catch(Exception ex) {
            Integer rome = ROME_VALUES.get(part.toUpperCase());
            if (rome != null) {
                return rome;
            } else {
                throw new IllegalArgumentException("Некорректный операнд");
            }
        }
    }

    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public String getAction() {
        return action;
    }
}
