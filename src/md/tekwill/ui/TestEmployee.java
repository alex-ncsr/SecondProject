package md.tekwill.ui;

import md.tekwill.dao.EmployeeDao;
import md.tekwill.model.Employee;
import md.tekwill.service.EmployeeService;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Ion", "Bostan");
        Employee employee2 = new Employee("Vasile", "Grosu");
        Employee employee3 = new Employee("Alex", "Fomin");

        EmployeeService employeeService = new EmployeeService();

        boolean isEmployeeSaved = employeeService.create(employee);
        employeeService.create(employee2);
        employeeService.create(employee3);
        employeeService.listEmployees();

        System.out.println("*************************");
        System.out.println(employeeService.read(3));
        System.out.println(employeeService.read(5));

        System.out.println("*************************");
//        System.out.println(isEmployeeSaved);
        employeeService.update(2, new Employee("Tom", "Cruise"));
        employeeService.listEmployees();

        System.out.println("*************************");
        employeeService.delete(1);
        employeeService.listEmployees();
    }
}
