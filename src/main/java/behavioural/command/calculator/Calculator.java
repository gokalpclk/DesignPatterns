package behavioural.command.calculator;

import java.math.BigDecimal;

/**
 * @author Gokalp on 29.01.2023
 * @project DesignPatterns
 */
public class Calculator {
    public static BigDecimal operation(Operation operation, BigDecimal num1, BigDecimal num2){
        BigDecimal result = operation.operation(num1, num2);
        return result;
    }
/*    public static BigDecimal operation(OperationType operationType, BigDecimal num1, BigDecimal num2) {
        BigDecimal result = BigDecimal.ZERO;
        if (OperationType.ADDITION.equals(operationType)) {
            result = num1.add(num2);
        } else if (OperationType.SUBTRACTION.equals(operationType)) {
            result = num1.subtract(num2);
        } else if (OperationType.DIVISION.equals(operationType)) {
            result = num1.divide(num2);
        } else if (OperationType.MULTIPLICATION.equals(operationType)) {
            result = num1.multiply(num2);
        } else if (OperationType.POW.equals(operationType)) {
            result = num1.pow(num2.intValue());
        } else if (OperationType.REMINDER.equals(operationType)) {
            result = num1.remainder(num2);
        }
        return result;
    }*/
}
