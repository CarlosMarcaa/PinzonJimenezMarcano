/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import DataStructures.List;
import DataStructures.Nodo;

/**
 *
 * @author Miguel
 */
public class Room {

    private int roomNumber;
    private String roomType;
    private int floor;
    public List guestHistory;

    public Room(int roomNumber, String roomType, int floor, List history) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.floor = floor;
        this.guestHistory = history;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getFloor() {
        return floor;
    }

    public List getGuestHistory() {
        return guestHistory;
    }

    public void printRoom() {
        System.out.println("Room: " + roomNumber);
        System.out.println("Type: " + roomType);
        System.out.println("Floor: " + floor);
        System.out.println("");
    }

    public String stringRoomHistory() {
        String RoomHistory = "";
        RoomHistory = "Room: " + roomNumber+ "ln"+"Type: " + roomType+"ln"+"Floor: " + floor+"ln"+"Guests History: "+"ln";
        if (getGuestHistory() != null) {
            Nodo pointer = getGuestHistory().getHead();
            while (pointer != null) {
                Guest guest = (Guest) pointer.getElement();
                RoomHistory += guest.stringGuest();
                System.out.println("");
                pointer = pointer.getNext();
            }
        }
        RoomHistory += "ln";
        return RoomHistory;
    }
}
