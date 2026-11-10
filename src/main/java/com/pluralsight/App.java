package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Room cleanRoom = new Room(2, 124.00, false, false);
        Room dirtyRoom = new Room(2, 124.00, false, true);
        Room occupiedRoom = new Room(1, 139.00, true, false);

        System.out.println("---- ROOM TEST ----");

        System.out.println("Clean room: " + cleanRoom.isAvailable());
        System.out.println("Dirty room: " + dirtyRoom.isAvailable());
        System.out.println("Occupied room: " + occupiedRoom.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);

        System.out.println("\n---- RESERVATION TEST ----");

        System.out.printf("Nightly Price: $%.2f%n", reservation.getPrice());

        System.out.printf("Weekend Surcharge: $%.2f%n", reservation.getWeekendSurcharge());

        System.out.printf("Reservation Total: $%.2f%n", reservation.getReservationTotal());

        Employee employee1 = new Employee(101, "John Smith", "Front Desk", 20, 20.00);

        Employee employee2 = new Employee(102, "Jane Doe", "Housekeeping", 45, 20.00);

        System.out.println("\n---- EMPLOYEE TEST ----");

        System.out.println("Employee 1");
        System.out.println("Regular Hours: " + employee1.getRegularHours());
        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());
        System.out.printf("Total Pay: $%.2f%n", employee1.getTotalPay());

        System.out.println("\nEmployee 2");
        System.out.println("Regular Hours: " + employee2.getRegularHours());
        System.out.println("Overtime Hours: " + employee2.getOvertimeHours());
        System.out.printf("Total Pay: $%.2f%n", employee2.getTotalPay());

        Guest guest = new Guest(101, "John", "Smith", "815-555-1234");

        System.out.println("\n---- GUEST TEST ----");

        System.out.println("Guest ID: " + guest.getGuestId());
        System.out.println("Guest Name: " + guest.getFullName());
        System.out.println("Phone Number: " + guest.getPhoneNumber());

        guest.setPhoneNumber("815-555-5678");

        System.out.println("Updated Phone: " + guest.getPhoneNumber());

        Room room = new Room(2, 124.00, false, false);

        System.out.println("\n---- ROOM TEST ----");

        System.out.println("Initially Available: " + room.isAvailable());

        room.checkIn();
        System.out.println("After Check-In: " + room.isAvailable());

        room.checkOut();
        System.out.println("After Check-Out: " + room.isAvailable());

        room.cleanRoom();
        System.out.println("After Cleaning: " + room.isAvailable());

        Employee employee = new Employee(103, "Alex Johnson", "Front Desk", 0, 20.00);

        System.out.println("\n---- EMPLOYEE TIME CLOCK ----");

        employee.punchTimeCard(9);
        employee.punchTimeCard(17);

        System.out.println("Hours Worked: " + employee.getHoursWorked());

        employee.punchIn(10);
        employee.punchOut(14);

        System.out.println("Updated Hours: " + employee.getHoursWorked());

        System.out.printf("Total Pay: $%.2f%n", employee.getTotalPay());

        System.out.println("\n---- EMPLOYEE CURRENT TIME TEST ----");

        Employee employee3 = new Employee(104, "Taylor Brown", "Front Desk", 0, 20.00);

        employee3.punchIn();
        employee3.punchOut();

        System.out.println("Hours Worked: " + employee3.getHoursWorked());

        System.out.printf("Total Pay: $%.2f%n", employee3.getTotalPay());

        System.out.println("\n---- HOTEL BOOKING TEST ----");

        Hotel hotel = new Hotel("Lakeside Inn", 2, 10);

        System.out.println("Book 2 Suites: " + hotel.bookRoom(2, true));
        System.out.println("Book 1 More Suite: " + hotel.bookRoom(1, true));
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
    }


}
