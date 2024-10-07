/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.algonquincollege.lab1;


    
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {

    @Test
    void testSingletonBehavior() {
        EmployeeManager instance1 = EmployeeManager.getInstance();
        EmployeeManager instance2 = EmployeeManager.getInstance();
        assertSame(instance1, instance2, "EmployeeManager should follow Singleton pattern");
    }

    @Test
    void testAddAndRetrieveEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.id = 1;
        manager.addEmployee(fullTimeEmployee);

        Employee retrieved = manager.getEmployee(1);
        assertNotNull(retrieved, "Employee should be retrievable after adding");
        assertEquals(1, retrieved.id, "Retrieved employee should have the correct ID");
    }

    @Test
    void testRemoveEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee employee = new FullTimeEmployee();
        employee.id = 2;
        manager.addEmployee(employee);

        manager.removeEmployee(employee);
        assertNull(manager.getEmployee(2), "Employee should be removed from the manager");
    }
}