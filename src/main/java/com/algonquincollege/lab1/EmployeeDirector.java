/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.lab1;

/**
 *
 * @author mzr_u
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    public Employee constructEmployee() {
        return builder.setId(1)
                      .setName("John Doe")
                      .setDepartment("Engineering")
                      .setRole("Developer")
                      .build();
    }
}
