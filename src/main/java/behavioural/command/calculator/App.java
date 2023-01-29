package behavioural.command.calculator;

import java.math.BigDecimal;

/**
 * @author Gokalp on 29.01.2023
 * @project DesignPatterns
 */
public class App {
    public static void main(String[] args) {
        BigDecimal addition = Calculator.operation(OperationType.ADDITION, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal subtract = Calculator.operation(OperationType.SUBTRACTION, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal pow = Calculator.operation(OperationType.SUBTRACTION, BigDecimal.TEN, BigDecimal.valueOf(2));

        System.out.println("Addition: " + addition);
        System.out.println("Subtract: " + subtract);
        System.out.println("Pow: " + pow);

    }
}
