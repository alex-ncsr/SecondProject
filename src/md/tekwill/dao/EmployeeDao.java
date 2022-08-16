package md.tekwill.dao;

import md.tekwill.model.Employee;

public class EmployeeDao {
    private static Employee[] employeesArr = new Employee[10];

    public void create(Employee employee) {
        for (int i = 0; i < employeesArr.length; i++) {
            Employee existingEmployee = employeesArr[i];
            if (existingEmployee == null) {
                employeesArr[i] = employee;
                break;
            }
        }
    }

    public Employee read(int employeeId) {
        //search employee by id
        for (Employee searchingEmployee : employeesArr) {
            if (searchingEmployee != null && searchingEmployee.getId() == employeeId) {
                return searchingEmployee;
            }
        }
        return null;
    }

    public void update(int employeeId, Employee updatedEmployee) {
        //search employee by id
        Employee findEmployee = read(employeeId);

        // update data from updatedEmployee to the old employee from employeesArr
        if (findEmployee != null) {
            findEmployee.setName(updatedEmployee.getName());
            findEmployee.setLastName(updatedEmployee.getLastName());
        }
    }

    public void delete(int employeeId) {
        //search employee by id
        Employee findEmployee = read(employeeId);
        // set to null
        employeesArr[findEmployee.getId() - 1] = null;
    }

    public Employee[] getAll() {
        return employeesArr;
    }
}
