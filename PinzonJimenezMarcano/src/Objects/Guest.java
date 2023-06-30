/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import DataStructures.Functions;

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
    private String email;
    private String gender;
    private String roomType;
    private String phone;
    private String arrival;
    private String checkout;

    public Guest(String firstName, String lastName) {

        this.firstName = Functions.capitalizeFirstLetter(firstName);
        this.lastName = Functions.capitalizeFirstLetter(lastName);
        this.fullName = firstName.toLowerCase() + lastName.toLowerCase();
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
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Id: " + id);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phone);
        System.out.println("Arrival: " + arrival);
        System.out.println("Checkout: " + checkout);
    }
    
    public String information(){
        String guest = "";
        guest = firstName +","+ lastName+","+Integer.toString(id)+","+email+","+phone+","+gender+","+roomType+","+arrival+","+checkout;
        return guest;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
    
    
}
