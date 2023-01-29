package behavioural.command.calculator;

import java.math.BigDecimal;

/**
 * @author Gokalp on 29.01.2023
 * @project DesignPatterns
 */
public class App {
    public static void main(String[] args) {
        BigDecimal addition = Calculator.operation(new AdditionCommand(), BigDecimal.TEN, BigDecimal.valueOf(3));
        BigDecimal subtract = Calculator.operation(new SubtractCommand(), BigDecimal.TEN, BigDecimal.valueOf(3));
        BigDecimal pow = Calculator.operation(new PowCommand(), BigDecimal.TEN, BigDecimal.valueOf(3));
        BigDecimal reminder = Calculator.operation(new ReminderCommand(), BigDecimal.TEN, BigDecimal.valueOf(3));


        System.out.println("Addition: " + addition);
        System.out.println("Subtract: " + subtract);
        System.out.println("Pow: " + pow);
        System.out.println("Reminder: " + reminder);

    }
}
