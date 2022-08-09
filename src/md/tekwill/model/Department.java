package md.tekwill.model;

public class Department {

    private int id;
    private String name;
    private static int idGenerator;

    public Department() {
        generateId();
    }


    public Department(int id, String name) {
        generateId();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void generateId() {
        idGenerator++;
        id = idGenerator;
    }

}
