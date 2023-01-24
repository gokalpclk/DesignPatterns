package structural.proxy;

import java.math.BigDecimal;

/**
 * @author Gokalp on 24.01.2023
 * @project DesignPatterns
 */
public class AdministratorProxy implements CompanyInformation {
    private RealAdministrator realAdministrator;

    private String username;
    private String password;

    public AdministratorProxy(String username, String password) {
        this.realAdministrator = new RealAdministrator();
        this.username = username;
        this.password = password;
    }

    private boolean isUserAdmin() {
        boolean isAdmin = false;
        boolean isUserValid = EmployeeUtil.isUserValid(username, password);
        if (isUserValid) {
            Employee employee = EmployeeUtil.getEmployeeByUsername(username);
            isAdmin = employee.isAdmin();
        }
        return isAdmin;
    }

    @Override
    public BigDecimal getEndorsement() throws IllegalAccessException {
        boolean userAdmin = isUserAdmin();
        if (userAdmin) {
            return realAdministrator.getEndorsement();
        } else {
            throw new IllegalAccessException();
        }
    }
}
