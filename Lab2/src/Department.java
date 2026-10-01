// Задания 2.4, 3.4

import java.util.ArrayList;

public class Department {
    private String name;
    private Employee boss;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    // 3.4
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // 3.4
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String toString() {
        if (boss == null) {
            return "Отдел " + name + ", начальник не назначен";
        }
        return "Отдел " + name + ", начальник: " + boss.getName();
    }
}
