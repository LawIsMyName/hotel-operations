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

        System.out.printf("Nightly Price: $%.2f%n",
                reservation.getPrice());

        System.out.printf("Reservation Total: $%.2f%n",
                reservation.getReservationTotal());

    }
}
