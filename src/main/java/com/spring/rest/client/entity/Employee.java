package com.spring.rest.client.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * class Employee for convert JSON objects from DB into -> Java_Object
 */
@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private String surname;
    private String department;
    private int salary;
    public Employee() {
    }
    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }
}
