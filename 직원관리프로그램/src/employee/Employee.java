package employee;

abstract public class Employee {
    protected int id;
    protected String name;
    protected String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDepartment() {
        return department;
    }
}
