package synechron;

import Java8.model.Department;

public class Employee {
    String id;
    String Name;

    int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
