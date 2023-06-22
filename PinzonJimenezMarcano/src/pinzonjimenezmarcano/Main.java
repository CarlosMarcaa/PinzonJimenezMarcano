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
        
        
        //HashTableClass table = new HashTableClass(30);
        Guest carlos1 = new Guest("carlos", "marcano");
        carlos1.setId(30);
        //table.put(carlos1, 23);
        Guest nicoll = new Guest("nicoll", "pinzas");
        nicoll.setId(15);
        Guest miguel = new Guest("miguel", "uwu");
        miguel.setId(63);
        //table.put(miguel, 12);
        //table.printHashTable();
        //System.out.println(table.getGuestRoom("carlos", "marcano"));
   
        //table.printHashTable();
        
        
        ABBClass tree = new ABBClass();
        tree.insert(carlos1, tree.getRoot());
        tree.insert(miguel, tree.getRoot());
        tree.insert(nicoll, tree.getRoot());
        
        
        tree.preOrden(tree.getRoot());
        System.out.println("");
        tree.delete(63, null, tree.getRoot());
        //tree.searchId(tree.getRoot(), 15);
        System.out.println("");
        tree.preOrden(tree.getRoot());
        
        
        
        
    }
    
}
