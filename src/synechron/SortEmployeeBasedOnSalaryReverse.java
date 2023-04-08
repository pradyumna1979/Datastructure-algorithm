package synechron;

import Java8.model.Department;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeBasedOnSalaryReverse {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("1","Pradyumna",1000),
                new Employee("2","Rama",2000),
                new Employee("3","Lisha",1500),
                new Employee("4","Pratyush",20000),
                new Employee("5","Pratyusha",1000)
        );
        sort(employeeList);
    }
    public static void sort(List<Employee> employeeList){
       List<Employee> employees=employeeList.stream()
               .sorted(Comparator.comparing(Employee::getSalary).reversed())
               .collect(Collectors.toList());
        System.out.println(employees);
    }
}
