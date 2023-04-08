package Java8.mainClass;

import Java8.model.Department;
import Java8.model.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import static java.util.stream.Collectors.*;

public class  HigestSalaryOfEachDept {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("1","Pradyumna",new Department("1","IT",1000)),
                new Employee("2","Rama",new Department("2","IT",2000)),
                new Employee("3","Lisha",new Department("3","IT",1500)),
                new Employee("4","Pratyush",new Department("4","QA",20000)),
                new Employee("5","Pratyusha",new Department("5","QA",1000))

        );
        List<Department> departments = Arrays.asList(new Department("1","IT",1000),
        new Department("2","IT",2000),
                new Department("3","IT",1500),
                new Department("4","QA",20000),
                new Department("5","QA",1000));
        Comparator<Department> comparator = Comparator.comparing(Department::getSalary);
        Map<String, Optional<Department>> map=departments.stream()
                        .collect(groupingBy(Department::getName, reducing(BinaryOperator.maxBy(comparator))));


        Map<Department, Set<Employee>> wellPaidEmployeesByDepartment    = employeeList.stream()
                .collect(groupingBy(Employee::getDepartment,filtering(e -> e.getDepartment().getSalary() > 2000,toSet())));
        System.out.println(wellPaidEmployeesByDepartment);
    }
}
