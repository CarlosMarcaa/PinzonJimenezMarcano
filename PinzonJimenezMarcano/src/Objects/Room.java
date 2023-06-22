/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Miguel
 */
public class Room {
    private int roomNumber;
    private String roomType;
    private int floor;

    public Room(int roomNumber, String roomType, int floor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.floor = floor;
    }    
    
    public void printRoom(){
        System.out.println("Room: "+roomNumber);
        System.out.println("Type: " + roomType);
        System.out.println("Floor: " + floor);
        System.out.println("");
    }
}
