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
    private Guest[] table;
    private int size;
    private int capacity;
    
    public HashTableClass(int size) {
        this.table = new Guest[size];
        this.size = size;
        this.capacity = 0;
    }
    
    public int generateHashCode(Guest guest){
    String key1 = guest.getFullName();
    int key2 = guest.getId();
    int code = Objects.hash(key1,key2) % size;
    return  java.lang.Math.abs(code);
    }
    
    public boolean isFull(){
        return capacity == size;
    }
    public void put(String firstName, String lastName, int id, int room) {
        Guest guest = new Guest(firstName, lastName, id);
        guest.setRoom(room);
        if (isFull()){
            System.out.println("Sorry, we are at full capacity at the moment");
            
        }else{          
            // Falta chequear si el caso de las colisiones, y el caso de que se agrega el mismo usuario dos veces
            int index = generateHashCode(guest);
            table[index] = guest;
            capacity++;
        }
    }
    
    public Guest get(Guest guest){
        int index = generateHashCode(guest);
        return table[index];
    }
    
    public void printHashTable(){
        for (int i = 0; i != size; i++){
            
            if (table[i] == null){
                System.out.println("[" + i + "] " + "null");
            }else{
                System.out.print("[" + i + "] "); table[i].printGuest(); System.out.println("");
            }
        }
    }
}
