package md.tekwill.model;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private Department department;
    private static int idGenerator;


    public Employee() {
        generateId();
    }

    public Employee(String name, String lastName) {
        generateId();
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    private void generateId() {
        idGenerator++;
        id = idGenerator;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                '}';
    }
}
