package structural.proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gokalp on 24.01.2023
 * @project DesignPatterns
 */
public class EmployeeUtil {
    public static List<Employee> getEmployeeList() {
        Employee gokalp = new Employee("Gokalp", "123", false);
        Employee ayse = new Employee("Ayse", "1234", false);
        Employee kerem = new Employee("Kerem", "12345", true);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(gokalp);
        employeeList.add(ayse);
        employeeList.add(kerem);

        return employeeList;
    }

    public static Map<String, Employee> getUsernameEmployeeMap() {
        List<Employee> employeeList = getEmployeeList();
        Map<String, Employee> map = new LinkedHashMap<>();
        for (Employee employee : employeeList) {
            map.put(employee.getUsername(), employee);
        }

        return map;
    }

    public static Employee getEmployeeByUsername(String username) {
        Map<String, Employee> map = getUsernameEmployeeMap();
        Employee employee = map.get(username);
        return employee;
    }

    public static boolean isUserValid(String username, String password) {
        boolean isUserValid = false;
        Employee employee = getEmployeeByUsername(username);
        if(employee != null){
            isUserValid = employee.getPassword().equals(password);
        }

        return isUserValid;
    }
}
