package Java8.model;

import java.util.List;

public class Employee {
    String id;
    String Name;
    Department department;

    public Employee(String id, String name, Department department) {
        this.id = id;
        Name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
