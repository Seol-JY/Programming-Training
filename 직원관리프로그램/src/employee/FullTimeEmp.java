package employee;

public class FullTimeEmp extends Employee {
    private String position;
    private int grade;

    public FullTimeEmp() {
        super(100, null, null);
        this.position = null;
        this.grade = 0;
    }

    public FullTimeEmp(int id, String name, String department, String position, int grade) {
        super(id, name, department);
        this.position = position;
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }
    public String getPosition() {
        return position;
    }
}
