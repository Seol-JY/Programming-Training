package employee;
import java.util.Vector;

public class EmployeeSet {
    Vector<Employee> Emp;
    int indexEmployee;
    int indexFullTime;
    int indexPartTime;
    int indexFullTime_id;
    int indexPartTime_id;

    public EmployeeSet() {
        Emp = new Vector();
        indexEmployee = 0;
        indexPartTime = 0;
        indexFullTime = 0;
        indexFullTime_id = 0;
        indexPartTime_id = 0;
    }

    public boolean RegisterFullTimeEmp(String name, String department, String position, String grade) {
        if (name.equals("") || grade.equals("")) {
            return false;
        }
        int integer_grade;
        try {
            integer_grade = Integer.parseInt(grade);
        }catch (NumberFormatException e) {
            return false;
        }
        int id = 10101 + indexFullTime_id;
        Emp.add(new FullTimeEmp(id, name, department, position, integer_grade));
        indexFullTime_id++;
        indexEmployee++;
        indexFullTime++;
        return true;
    }

    public boolean RegisterPartTimeEmp(String name, String department, String hours) {
        if (name.equals("") || hours.equals("")) {
            return false;
        }
        int integer_hours;
        try {
            integer_hours = Integer.parseInt(hours);
        }catch (NumberFormatException e) {
            return false;
        }
        int id = 50101 + indexPartTime_id;
        Emp.add(new PartTimeEmp(id, name, department, integer_hours));
        indexPartTime_id++;
        indexEmployee++;
        indexPartTime++;
        return true;
    }

    public String[][] searchAll(boolean full, boolean part) {
        int index=0;
        int height = 0;
        height+= full?indexFullTime:0;
        height+= part?indexPartTime:0;
        String[][] DataOfAllEmp = new String[height][7];

        for(int i=0; i<indexEmployee; i++)
        {
            if(Emp.get(i) instanceof FullTimeEmp && full)
            {
                FullTimeEmp dataEmp = (FullTimeEmp) Emp.get(i);

                DataOfAllEmp[index][0] = "정규직";
                DataOfAllEmp[index][1] = Integer.toString(dataEmp.getId());
                DataOfAllEmp[index][2] = dataEmp.getName();
                DataOfAllEmp[index][3] = dataEmp.getDepartment();
                DataOfAllEmp[index][4] = dataEmp.getPosition();
                DataOfAllEmp[index][5] = Integer.toString(dataEmp.getGrade());
                DataOfAllEmp[index][6] = "X";

                index++;
            }
            else if(Emp.get(i) instanceof PartTimeEmp && part)
            {
                PartTimeEmp dataEmp = (PartTimeEmp) Emp.get(i);

                DataOfAllEmp[index][0] = "임시직";
                DataOfAllEmp[index][1] = Integer.toString(dataEmp.getId());
                DataOfAllEmp[index][2] = dataEmp.getName();
                DataOfAllEmp[index][3] = dataEmp.getDepartment();
                DataOfAllEmp[index][4] = "X";
                DataOfAllEmp[index][5] = "X";
                DataOfAllEmp[index][6] = Integer.toString(dataEmp.getHours());

                index++;
            }
        }
        return DataOfAllEmp;
    }

    public String[][] searchName(String name) {
        int index=0;
        int size=0;
        Vector<Object> temp = new Vector<Object>();
        for(int i=0; i<indexEmployee; i++) {
            if(name.equals(((Employee)Emp.get(i)).getName())) {
                temp.add((Employee)Emp.get(i));
                size++;
            }
        }
        String[][] DataOfname = new String[size][7];

        for(int i=0;i<size;i++)
        {
            if(temp.get(i) instanceof FullTimeEmp)
            {
                DataOfname[i][0] = "정규직";
                DataOfname[i][1] = Integer.toString(((FullTimeEmp) temp.get(i)).getId());
                DataOfname[i][2] = ((FullTimeEmp)temp.get(i)).getName();
                DataOfname[i][3] = ((FullTimeEmp)temp.get(i)).getDepartment();
                DataOfname[i][4] = ((FullTimeEmp)temp.get(i)).getPosition();
                DataOfname[i][5] = Integer.toString(((FullTimeEmp) temp.get(i)).getGrade());
                DataOfname[i][6] = "X";
            }
            else
            {
                DataOfname[i][0] = "임시직";
                DataOfname[i][1] = Integer.toString(((PartTimeEmp) temp.get(i)).getId());
                DataOfname[i][2] = ((PartTimeEmp) temp.get(i)).getName();
                DataOfname[i][3] = ((PartTimeEmp) temp.get(i)).getDepartment();
                DataOfname[i][4] = "X";
                DataOfname[i][5] = "X";
                DataOfname[i][6] = Integer.toString(((PartTimeEmp) temp.get(i)).getHours());
            }
        }
        return DataOfname;
    }

    public int UpdateSelector(String id_string) {    // 업데이트 할 ID탐색 후 idx반환
        int id;
        try {
            id = Integer.parseInt(id_string);
        } catch (NumberFormatException e) {
            return -1;
        }
        for(int n = 0; n < this.indexEmployee; n++) {
            if (this.Emp.get(n).getId() == id) {
                return n;
            }
        }
        return -1;
    }

    public boolean UpdateInstanceFull(int idx) {
        return (this.Emp.get(idx) instanceof FullTimeEmp);
    }

    public boolean UpdateFullTimeEmp(int idx, String name, String department, String position, String grade) {
        if (name.equals("") || grade.equals("")) {
            return false;
        }
        int integer_grade;
        try {
            integer_grade = Integer.parseInt(grade);
        }catch (NumberFormatException e) {
            return false;
        }
        Emp.set(idx, new FullTimeEmp(Emp.get(idx).getId(), name, department, position, integer_grade));
        return true;
    }

    public boolean UpdatePartTimeEmp(int idx, String name, String department, String hours) {
        if (name.equals("") || hours.equals("")) {
            return false;
        }
        int integer_hours;
        try {
            integer_hours = Integer.parseInt(hours);
        }catch (NumberFormatException e) {
            return false;
        }
        Emp.set(idx, new PartTimeEmp(Emp.get(idx).getId(), name, department, integer_hours));
        return true;
    }


    public boolean DeleteInformation(String id_string) {
        int id;
        try {
            id = Integer.parseInt(id_string);
        } catch (NumberFormatException e) {
            return false;
        }

        for(int n = 0; n < this.indexEmployee; n++) {
            if (this.Emp.get(n).getId() == id) {
                if (this.Emp.get(n) instanceof FullTimeEmp) {
                    this.Emp.remove(n);
                    indexFullTime--;
                } else if (this.Emp.get(n) instanceof PartTimeEmp) {
                    this.Emp.remove(n);
                    indexPartTime--;
                }
                indexEmployee--;
                return true;
            }
        }
        return false;
    }
}
