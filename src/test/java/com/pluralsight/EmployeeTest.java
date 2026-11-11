package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchInAndOut_should_calculateFourHoursWorked() {
        Employee employee = new Employee(101, "John Smith", "Front Desk", 0, 20.00);

        employee.punchIn(10);
        employee.punchOut(14);

        assertEquals(4.0, employee.getHoursWorked());
    }

    @Test
    public void punchInAndOut_should_addTwoHoursToExistingHours() {
        Employee employee = new Employee(101, "John Smith", "Front Desk", 8, 20.00);

        employee.punchIn(13);
        employee.punchOut(15);

        assertEquals(10.0, employee.getHoursWorked());
    }
}