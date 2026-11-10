package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double hoursWorked;
    private double payRate;
    private double startTime;
    private boolean isPunchedIn = false;

    public Employee(int employeeId, String name,
                    String department, double hoursWorked,
                    double payRate) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getRegularHours() {

        if (hoursWorked > 40) {
            return 40;
        }

        return hoursWorked;
    }

    public double getOvertimeHours() {

        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }

        return 0;
    }

    public double getTotalPay() {

        double regularPay = getRegularHours() * payRate;

        double overtimePay = getOvertimeHours() * payRate * 1.5;

        return regularPay + overtimePay;
    }

    public void punchIn(int time) {

        startTime = time;
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();

        double time = now.getHour() + now.getMinute() / 60.0;

        startTime = time;
    }

    public void punchOut(int time) {

        double hours = time - startTime;

        hoursWorked = hoursWorked + hours;
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();

        double time = now.getHour() + now.getMinute() / 60.0;

        hoursWorked = hoursWorked + (time - startTime);
    }

    public void punchTimeCard(int time) {

        if (!isPunchedIn) {
            punchIn(time);
            isPunchedIn = true;
        } else {
            punchOut(time);
            isPunchedIn = false;
        }
    }

}
