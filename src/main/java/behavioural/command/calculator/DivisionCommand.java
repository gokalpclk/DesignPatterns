package behavioural.command.calculator;

import java.math.BigDecimal;

/**
 * @author Gokalp on 29.01.2023
 * @project DesignPatterns
 */
public class DivisionCommand implements Operation {
    @Override
    public BigDecimal operation(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2);
    }
}
