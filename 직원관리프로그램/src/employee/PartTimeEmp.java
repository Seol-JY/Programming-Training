package employee;

public class PartTimeEmp extends Employee {
    private int hours;

    public PartTimeEmp() {
        super(100, null, null);
        this.hours = 0;
    }

    public PartTimeEmp(int id, String name, String department, int hours) {
        super(id, name, department);
        this.hours = hours;
    }
    public int getHours() {
        return hours;
    }
}
