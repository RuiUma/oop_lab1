/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.lab1;

/**
 *
 * @author mzr_u
 */
public class EmployeeFactory {
    public static Employee createEmployee(String type) {
        switch (type.toLowerCase()) {
            case "fulltime":
                return new FullTimeEmployee();
            case "parttime":
                return new PartTimeEmployee();
            default:
                throw new IllegalArgumentException("Unknown employee type: " + type);
        }
    }
}
