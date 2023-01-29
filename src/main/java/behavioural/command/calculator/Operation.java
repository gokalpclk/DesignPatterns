package behavioural.command.calculator;

import java.math.BigDecimal;

/**
 * @author Gokalp on 29.01.2023
 * @project DesignPatterns
 */
public interface Operation {
    BigDecimal operation(BigDecimal num1, BigDecimal num2);
}
