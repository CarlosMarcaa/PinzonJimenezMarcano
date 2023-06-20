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
        
        /*
        HashTableClass table = new HashTableClass(30);
        table.put("carlos", "marcano", 23);
        table.printHashTable();
        
        System.out.println(table.getGuestRoom("carlos", "marcano"));*/
        
        ABBClass tree = new ABBClass();
        tree.insert(20, tree.getRoot());
        tree.insert(45, tree.getRoot());
        tree.insert(67, tree.getRoot());
        tree.insert(15, tree.getRoot());
        tree.insert(2, tree.getRoot());
        tree.insert(3, tree.getRoot());
        
        tree.preOrden(tree.getRoot());
        tree.delete(2, null, tree.getRoot());
        tree.preOrden(tree.getRoot());
        
        
        
    }
    
}
