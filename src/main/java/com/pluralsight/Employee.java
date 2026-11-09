package com.pluralsight;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, String firstName,
                    String lastName, double hoursWorked,
                    double payRate) {

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
}
