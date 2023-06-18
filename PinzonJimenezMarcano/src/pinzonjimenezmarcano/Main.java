/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pinzonjimenezmarcano;
import DataStructures.*;
/**
 *
 * @author Carlos Marcano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTableClass table = new HashTableClass(30);
        //conseguir forma de inicializar las listas del array de listas, se crean null
        table.put("carlos", "marcano", 23);
        table.printHashTable();
        
        System.out.println(table.getGuestRoom("carlos", "marcano"));
        
        
        
        
    }
    
}
