/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;
import java.util.Objects;
/**
 *
 * @author Carlos Marcano
 */
public class HashTableClass {
    private ListaClass[] table;
    private int tableSize;
    private int capacity;
    private int maxCapacity;
    
    public HashTableClass(int maxCapacity) {
        this.table = new ListaClass[maxCapacity*3];
        this.tableSize = maxCapacity*3;
        this.capacity = 0;
        this.maxCapacity = maxCapacity;
        
    }
    
    
    
    public int generateHashCode(Guest guest){
    String key1 = guest.getFullName();
    int code = java.lang.Math.abs(Objects.hash(key1)) % tableSize;
    return code;
    }
    
    public boolean isFull(){
        return capacity == maxCapacity;
    }
    
    public void put(String firstName, String lastName, int room) {
        Guest guest = new Guest(firstName, lastName);
        guest.setRoom(room);
        if (isFull()){
            System.out.println("Sorry, we are at full capacity at the moment");
            return;
        }else{          
            
            int index = generateHashCode(guest);
            
            if (table[index] == null){
                table[index] = new ListaClass();
                table[index].insertBegin(guest);
                capacity++;
            }else{
                if (getTable()[index].searchElement(guest.getFullName()) == null){
                System.out.println(guest.getFullName() + " is already in the list");
                }else{
                   getTable()[index].insertBegin(guest);
                    capacity++; 
                }
            }  
        }
    }
    
    public int getGuestRoom(String firstName, String lastName){
        firstName = Functions.capitalizeFirstLetter(firstName);
        lastName = Functions.capitalizeFirstLetter(lastName);
        String fullName = firstName.toLowerCase() + lastName.toLowerCase();
        

        Guest guest = new Guest(firstName, lastName); // Este Guest creado solo sirve para generar el hashcode, no contiene toda la informacion.
        int index = generateHashCode(guest);
        if (getTable()[index] == null){                 // Cuando no encuentra al huesped en el sistema, devuelve -1
            System.out.println(guest.getFullName() + " isn't staying at the hotel");
            
            return -1;
            
        }else{
            Nodo pointer = table[index].getHead();
            
            while (pointer != null){
                Guest pointerGuest = (Guest) pointer.getElement();
                if (pointerGuest.getFullName().equals(fullName)){
                    return pointerGuest.getRoom();
                }
                pointer = pointer.getNext();
            }
            return -1;
        }
    }
    
    public void printHashTable(){
        for (int i = 0; i != tableSize; i++){

            if (getTable()[i] != null){
                Nodo pointer = getTable()[i].getHead();
                
                while (pointer != null){
                    Guest guestToPrint = (Guest) pointer.getElement();
                    System.out.println("[ " + guestToPrint.getFirstName() + " " +  guestToPrint.getLastName() + ": Room " + guestToPrint.getRoom() + " ]");
                    pointer = pointer.getNext();
                }
            }
        }
    }

    public ListaClass[] getTable() {
        return table;
    }
    
}
