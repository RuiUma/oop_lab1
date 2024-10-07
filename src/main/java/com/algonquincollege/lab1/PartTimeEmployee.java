
package com.algonquincollege.lab1;

/**
 *
 * @author mzr_u
 */
public class PartTimeEmployee extends Employee {
    public PartTimeEmployee() {
        this.workingHoursPerWeek = 20; // Example for part-time hours
    }

    @Override
    public void clockIn() {
        System.out.println(name + " clocked in as a part-time employee.");
    }

    @Override
    public void clockOut() {
        System.out.println(name + " clocked out as a part-time employee.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " tracked " + workingHoursPerWeek + " hours this week.");
    }
}