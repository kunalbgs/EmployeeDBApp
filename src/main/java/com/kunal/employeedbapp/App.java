package com.kunal.employeedbapp;

import com.kunal.employeedbapp.dao.EmployeeDao;
import com.kunal.employeedbapp.dao.EmployeeDaoJdbc;
import com.kunal.employeedbapp.model.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting EmployeeDBApp...");
        EmployeeDao dao = new EmployeeDaoJdbc();

        try {
            Employee e1 = new Employee("Test User", "test.user@example.com", "IT", 55000.0);
            int id1 = dao.add(e1);
            System.out.println("Inserted: " + e1);

            List<Employee> all = dao.findAll();
            System.out.println("All employees: " + all);

            var found = dao.findById(id1);
            System.out.println("Find by id: " + found.orElse(null));

            e1 = new Employee(id1, "Test User", "test.user@example.com", "Engineering", 60000.0);
            boolean updated = dao.update(e1);
            System.out.println("Updated? " + updated + " -> " + e1);

          boolean deleted = dao.delete(id1);
            System.out.println("Deleted? " + deleted);

            System.out.println("Remaining employees: " + dao.findAll());
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}