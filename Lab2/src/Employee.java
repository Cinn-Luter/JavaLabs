// Задания 2.4, 3.4

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        department.addEmployee(this); // 3.4
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public String toString() {
        Employee boss = department.getBoss();
        if (boss == this) {
            return name + " начальник отдела " + department.getName();
        } else if (boss == null) {
            return name + " работает в отделе " + department.getName() + ", начальник не назначен";
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого " + boss.getName();
        }
    }
}
