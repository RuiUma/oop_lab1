/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.algonquincollege.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeFactoryTest {

    @Test
    void testFullTimeEmployeeCreation() {
        Employee employee = EmployeeFactory.createEmployee("fulltime");
        assertNotNull(employee, "Full-time employee should be created by the factory");
        assertTrue(employee instanceof FullTimeEmployee, "Created employee should be an instance of FullTimeEmployee");
    }

    @Test
    void testPartTimeEmployeeCreation() {
        Employee employee = EmployeeFactory.createEmployee("parttime");
        assertNotNull(employee, "Part-time employee should be created by the factory");
        assertTrue(employee instanceof PartTimeEmployee, "Created employee should be an instance of PartTimeEmployee");
    }

    @Test
    void testInvalidEmployeeType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            EmployeeFactory.createEmployee("invalid");
        });
        assertEquals("Unknown employee type: invalid", exception.getMessage(), "Exception message should match");
    }
}
