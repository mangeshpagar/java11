package com.mangesh.sorted;

import java.util.List;

public class SortedTest {
    public static void main(String[] args) {

        List<Employee> list= List.of(new Employee("1","Mangesh"),new Employee("2","Deepali"),new Employee("3","Aditya")
        ,new Employee("4","Raja"));

        list.stream().sorted((emp1,emp2) -> {return emp1.getName().compareTo(emp2.getName());}).forEach(System.out :: println);
    }
}
