/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.lab1;

/**
 *
 * @author mzr_u
 */
public class EMS {
    public static void main(String[] args) {
        EmployeeManager manager = EmployeeManager.getInstance();

        // 使用Builder模式创建全职员工
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(fullTimeBuilder);
        Employee fullTimeEmployee = director.constructEmployee();
        manager.addEmployee(fullTimeEmployee);

        // 使用Factory模式创建兼职员工
        Employee partTimeEmployee = EmployeeFactory.createEmployee("parttime");
        manager.addEmployee(partTimeEmployee);

        // 打印全职员工的信息
        System.out.println("Full-time employee:");
        fullTimeEmployee.clockIn();
        fullTimeEmployee.trackWorkHours();
        fullTimeEmployee.clockOut();

        // 打印兼职员工的信息
        System.out.println("Part-time employee:");
        partTimeEmployee.clockIn();
        partTimeEmployee.trackWorkHours();
        partTimeEmployee.clockOut();
    }
}
