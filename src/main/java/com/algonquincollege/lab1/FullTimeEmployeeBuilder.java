/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.lab1;

/**
 *
 * @author mzr_u
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private FullTimeEmployee employee;

    public FullTimeEmployeeBuilder() {
        this.employee = new FullTimeEmployee();
    }

    @Override
    public EmployeeBuilder setId(int id) {
        employee.id = id;
        return this;
    }

    @Override
    public EmployeeBuilder setName(String name) {
        employee.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        employee.department = department;
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        employee.role = role;
        return this;
    }

    @Override
    public Employee build() {
        return employee;
    }
}