/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquincollege.lab1;

/**
 *
 * @author mzr_u
 */
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {
        this.workingHoursPerWeek = 40; // Example for full-time hours
    }

    @Override
    public void clockIn() {
        System.out.println(name + " clocked in as a full-time employee.");
    }

    @Override
    public void clockOut() {
        System.out.println(name + " clocked out as a full-time employee.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " tracked " + workingHoursPerWeek + " hours this week.");
    }
}