/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Objects.Guest;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Marcano
 */
public class HashTableClass {
    
    // The hashtable will alwais be created 3 times bigger than the cuantity needed, so it can avoid collisions
    
    private ListaClass[] table;
    private int tableSize;
    private int capacity;
    private int maxCapacity;
    private boolean[] occupiedRooms;
    
    public boolean[] getOccupiedRooms() {
        return occupiedRooms;
    }

    public HashTableClass(int maxCapacity) {
        this.table = new ListaClass[maxCapacity * 3];
        this.tableSize = maxCapacity * 3;
        this.capacity = 0;
        this.maxCapacity = maxCapacity;
        this.occupiedRooms = new boolean[maxCapacity];

    }
    // Returns the size of the table
    public int getTableSize() {
        return tableSize;
    }
    // Given a Guest, generates a hashcode using the fullname attribute
    public int generateHashCode(Guest guest) {
        String key1 = guest.getFullName();
        int code = java.lang.Math.abs(Objects.hash(key1)) % tableSize;
        return code;
    }
    
    // Verifies if the table is at max capaity
    public boolean isFull() {
        return capacity == maxCapacity;
    }
    
    //Inserts an element into the hashtable
    public void put(Guest guest, int room) {

        guest.setRoom(room);
        if (occupiedRooms[room] == true) {
            System.out.println("The rooom " + room + " is already occupied");
            return;
        }
        if (isFull()) {
            System.out.println("Sorry, we are at full capacity at the moment");

        } else {
            if (room > maxCapacity || room < 1) {
                System.out.println("The room " + room + " does not exist." + " Can't add " + guest.getFirstName() + " " + guest.getLastName());
                return;
            }

            int index = generateHashCode(guest);

            if (table[index] == null) {
                table[index] = new ListaClass();
                table[index].insertBegin(guest);
                capacity++;
                occupiedRooms[room] = true;
            } else {

                getTable()[index].insertBegin(guest);
                capacity++;
                occupiedRooms[room] = true;
            }

        }
    }

    /* Given a firstname and a lastname String, it searches the hashtable and returns the room number of all 
    the guests with those names, as a string variable*/
    public String getGuestRoom(String firstName, String lastName) {
        firstName = Functions.capitalizeFirstLetter(firstName);
        lastName = Functions.capitalizeFirstLetter(lastName);
        String fullName = firstName.toLowerCase() + lastName.toLowerCase();
        String roomsFound = "";

        Guest guest = new Guest(firstName, lastName); // Este Guest creado solo sirve para generar el hashcode, no contiene toda la informacion.
        int index = generateHashCode(guest);
        if (getTable()[index] == null) {                 // Cuando no encuentra al huesped en el sistema, devuelve -1
            JOptionPane.showMessageDialog(null, guest.getFullName() + "no se esta quedando en el hotel");

            return roomsFound;

        } else {
            Nodo pointer = table[index].getHead();

            while (pointer != null) {
                Guest pointerGuest = (Guest) pointer.getElement();
                if (pointerGuest.getFullName().equals(fullName)) {
                    String roomToAdd = String.valueOf(pointerGuest.getRoom());
                    roomsFound = roomsFound + roomToAdd + " ";

                }
                pointer = pointer.getNext();
            }
            return roomsFound;
        }
    }
    
    // Deletes a guest from the hashtable
    public Guest deleteGuest(Guest guestToDelete) {
        int index = generateHashCode(guestToDelete);

        if (getTable()[index] == null) {
            System.out.println(guestToDelete.getFullName() + " isn't staying at the hotel"); // Posible nullpointer, si no encuentra el Guest que se esta buscando, devuelve null
            return null;
        } else {
            Nodo pointer = table[index].getHead();
            boolean flag = false;
            while (pointer != null) {
                Guest pointerGuest = (Guest) pointer.getElement();
                if (pointerGuest == guestToDelete) {
                    //Poner habitacion disponible en el array, eliminar el elemento de la lista
                    flag = true;

                }
                pointer = pointer.getNext();
            }
            if (flag == true) {
                occupiedRooms[guestToDelete.getRoom()] = false;
                table[index].deleteElement(guestToDelete);
                capacity--;
                return guestToDelete;
            } else {
                System.out.println(guestToDelete.getFullName() + " isn't staying at the hotel");
                return null;
            }
        }

    }
    
    // Prints the hashtable (only for developing use)
    public void printHashTable() {
        int counter = 0;
        for (int i = 0; i != tableSize; i++) {

            if (getTable()[i] != null) {
                Nodo pointer = getTable()[i].getHead();

                while (pointer != null) {
                    Guest guestToPrint = (Guest) pointer.getElement();
                    System.out.println("[ " + guestToPrint.getFirstName() + " " + guestToPrint.getLastName() + ": Room " + guestToPrint.getRoom() + " ]");
                    pointer = pointer.getNext();
                    System.out.println(counter++);
                }
            }
        }
    }
    
    // Returns the table
    public ListaClass[] getTable() {
        return table;
    }

}
