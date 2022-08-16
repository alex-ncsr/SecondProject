package md.tekwill.service;

import md.tekwill.dao.EmployeeDao;
import md.tekwill.model.Employee;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

    public boolean create(Employee employee) {
        if (employee.getName().length() > 0 &&
                employee.getLastName().length() > 0) {
            employeeDao.create(employee);
            return true;

        }
        System.out.println("Employee validation failed!");
        return false;
    }

    public Employee read(int employeeId) {
        if (employeeDao.read(employeeId) == null) {
            System.out.println("Employee with id " + employeeId + " doesn't exist");
        }
        return employeeDao.read(employeeId);
    }

    public void update(int employeeId, Employee updatedEmployee) {
        employeeDao.update(employeeId, updatedEmployee);
        System.out.println("Employee with id " + employeeId + " was updated");
    }

    public void delete(int employeeId) {
        employeeDao.delete(employeeId);
        System.out.println("Employee with id " + employeeId + " was deleted");
    }

    public void listEmployees() {
        for (Employee employee : employeeDao.getAll()) {
            if (employee != null) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Last name: " + employee.getLastName());
            }
        }
    }
}
