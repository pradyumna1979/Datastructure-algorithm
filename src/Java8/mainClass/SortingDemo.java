package Java8.mainClass;

import Java8.model.Department;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
    public static void main(String[] args) {
        List<Department> departments = Arrays.asList(new Department("1","IT",1000),
                new Department("2","IT",2000),
                new Department("3","IT",1500),
                new Department("4","QA",20000),
                new Department("5","AB",1000));
                ;
        List<Department> departmentList = departments.stream()
                .sorted(Comparator.nullsFirst(Comparator.comparing(Department::getSalary).thenComparing(Department::getName)))
                .collect(Collectors.toList());
        System.out.println(departmentList);
    }
}
