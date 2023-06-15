/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Carlos Marcano
 */
public class Guest {
    private int room;
    private String firstName;
    private String lastName;
    private int id;
    private String fullName;

    public Guest(String firstName, String lastName, int id) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.fullName = firstName + lastName;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void printGuest(){
        System.out.print(fullName + " Id: " + id + " Room: " + room);
    }
    
    
}
