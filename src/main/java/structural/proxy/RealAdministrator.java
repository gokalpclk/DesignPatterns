package structural.proxy;

import java.math.BigDecimal;

/**
 * @author Gokalp on 24.01.2023
 * @project DesignPatterns
 */
public class RealAdministrator implements CompanyInformation {
    @Override
    public BigDecimal getEndorsement() {
        return BigDecimal.valueOf(10000);
    }
}
