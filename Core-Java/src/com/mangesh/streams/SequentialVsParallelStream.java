package com.mangesh.streams;

import com.mangesh.core.Employee;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequentialVsParallelStream {

    public static void main(String[] args) {



        Employee e1 = new Employee(1, "Mangesh",10);
        Employee e2 = new Employee(2, "Shard",20);
        Employee e3 = new Employee(3, "dilip",30);
        Employee e4 = new Employee(4, "vik",40);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        List<Employee>  costlyEmployee =employeeList.parallelStream().peek(emp -> emp.setSalary(emp.getSalary()+5))
                                    .filter(employee -> employee.getSalary()>30)
                                    .collect(Collectors.toList());
        System.out.println(costlyEmployee);

    }


}
