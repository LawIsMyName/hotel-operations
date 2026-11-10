package com.pluralsight;

public class Guest {

    private int guestId;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Guest(int guestId, String firstName, String lastName, String phoneNumber) {

        this.guestId = guestId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getGuestId() {
        return guestId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

