package com.kunal.employeedbapp.model;

public class Employee {
    private Integer id;
    private String name;
    private String email;
    private String department;
    private double salary;

    public Employee(Integer id, String name, String email, String department, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String name, String email, String department, double salary) {
        this(null, name, email, department, salary);
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=%d, name='%s', email='%s', dept='%s', salary=%.2f}"
                .formatted(id, name, email, department, salary);
    }
}