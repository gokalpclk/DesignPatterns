package structural.proxy;

import java.math.BigDecimal;

/**
 * @author Gokalp on 24.01.2023
 * @project DesignPatterns
 */
public class App {
    public static void main(String[] args) {
        AdministratorProxy administratorProxy = new AdministratorProxy("Kerem", "12345");
        try {
            BigDecimal endorsement = administratorProxy.getEndorsement();
            System.out.println("Company Endorsement: " + endorsement);

        } catch (IllegalAccessException e) {
            System.out.println("Access Denied");
        }
    }
}
