/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.lab1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mzr_u
 */

public class EmployeeManager {
    private static EmployeeManager instance = new EmployeeManager();
    private List<Employee> employees;

    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    public static EmployeeManager getInstance() {
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public Employee getEmployee(int id) {
        return employees.stream().filter(e -> e.id == id).findFirst().orElse(null);
    }
    
     protected Object readResolve() {
        return getInstance();
    }
}