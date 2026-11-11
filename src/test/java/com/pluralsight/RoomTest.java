package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_markRoomOccupiedAndDirty() {
        Room room = new Room(1, 180, false, false);

        room.checkIn();

        assertEquals(true, room.isOccupied());
        assertEquals(true, room.isDirty());
    }

    @Test
    public void checkOut_should_markRoomNotOccupiedAndDirty() {
        Room room = new Room(1, 180, true, true);

        room.checkOut();

        assertEquals(false, room.isOccupied());
        assertEquals(true, room.isDirty());

    }

    @Test
    public void cleanRoom_should_makeEmptyDirtyRoomAvailable() {
        Room room = new Room(1, 180, false, true);

        room.cleanRoom();

        assertEquals(false, room.isDirty());
        assertEquals(false, room.isOccupied());
        assertEquals(true, room.isAvailable());
    }

    @Test
    public void checkIn_should_notOccupyDirtyRoom() {
        Room room = new Room(1, 180, false, true);

        room.checkIn();

        assertEquals(false, room.isOccupied());
        assertEquals(true, room.isDirty());
        assertEquals(false, room.isAvailable());
    }

    @Test
    public void checkIn_should_notChangeAlreadyOccupiedRoom() {
        Room room = new Room(2, 124.00, true, false);

        room.checkIn();

        assertEquals(true, room.isOccupied());
        assertEquals(false, room.isDirty());
        assertEquals(false, room.isAvailable());
    }

    @Test
    public void cleanRoom_should_notCleanOccupiedRoom() {
        Room room = new Room(1, 180, true, true);

        room.cleanRoom();

        assertEquals(true, room.isOccupied());
        assertEquals(true, room.isDirty());
        assertEquals(false, room.isAvailable());
    }

}