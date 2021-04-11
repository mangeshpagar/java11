package com.mangesh.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
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

        employeeList.stream().filter(e-> e.getId() >3).forEach(e->e.setName("changed"));
        System.out.println(employeeList);

    }

}
