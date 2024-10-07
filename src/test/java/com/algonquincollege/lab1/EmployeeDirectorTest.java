/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.algonquincollege.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeDirectorTest {

    @Test
    void testFullTimeEmployeeConstruction() {
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        Employee fullTimeEmployee = director.constructEmployee();
        
        assertNotNull(fullTimeEmployee, "Full-time employee should be created");
        assertEquals("John Doe", fullTimeEmployee.name, "Employee name should be set correctly");
        assertEquals("Engineering", fullTimeEmployee.department, "Employee department should be set correctly");
        assertEquals(40, fullTimeEmployee.workingHoursPerWeek, "Full-time employee should have 40 hours per week");
    }

    @Test
    void testPartTimeEmployeeConstruction() {
        EmployeeBuilder builder = new PartTimeEmployeeBuilder();
        Employee partTimeEmployee = builder.setId(2)
                                           .setName("Jane Doe")
                                           .setDepartment("Marketing")
                                           .setRole("Assistant")
                                           .build();

        assertNotNull(partTimeEmployee, "Part-time employee should be created");
        assertEquals("Jane Doe", partTimeEmployee.name, "Employee name should be set correctly");
        assertEquals("Marketing", partTimeEmployee.department, "Employee department should be set correctly");
        assertEquals(20, partTimeEmployee.workingHoursPerWeek, "Part-time employee should have 20 hours per week");
    }
}