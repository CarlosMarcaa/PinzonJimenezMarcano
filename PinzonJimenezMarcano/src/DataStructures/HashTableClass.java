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

    public int getTableSize() {
        return tableSize;
    }

    public int generateHashCode(Guest guest) {
        String key1 = guest.getFullName();
        int code = java.lang.Math.abs(Objects.hash(key1)) % tableSize;
        return code;
    }

    public boolean isFull() {
        return capacity == maxCapacity;
    }

    public void put(Guest guest, int room) {

        guest.setRoom(room);
        if (occupiedRooms[room] == true) {
            return;
        }
        if (isFull()) {

        } else {
            if (room > maxCapacity || room < 1) {
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

    public String getGuestRoom(String firstName, String lastName) {
        firstName = Functions.capitalizeFirstLetter(firstName);
        lastName = Functions.capitalizeFirstLetter(lastName);
        String fullName = firstName.toLowerCase() + lastName.toLowerCase();
        String roomsFound = "";

        Guest guest = new Guest(firstName, lastName); // Este Guest creado solo sirve para generar el hashcode, no contiene toda la informacion.
        int index = generateHashCode(guest);
        if (getTable()[index] == null) {                 // Cuando no encuentra al huesped en el sistema, devuelve -1
            JOptionPane.showMessageDialog(null, guest.getFullName() +""+ "no se esta quedando en el hotel");

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

    public Guest deleteGuest(Guest guestToDelete) {
        int index = generateHashCode(guestToDelete);

        if (getTable()[index] == null) {
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
                return null;
            }
        }

    }

    public void printHashTable() {
        int counter = 0;
        for (int i = 0; i != tableSize; i++) {

            if (getTable()[i] != null) {
                Nodo pointer = getTable()[i].getHead();

                while (pointer != null) {
                    Guest guestToPrint = (Guest) pointer.getElement();
                    pointer = pointer.getNext();
                }
            }
        }
    }

    public ListaClass[] getTable() {
        return table;
    }

}
