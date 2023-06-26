/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pinzonjimenezmarcano;

import DataStructures.*;
import DataManagement.CsvManager;
import Objects.Guest;

/**
 *
 * @author Carlos Marcano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CsvManager cvsManager = new CsvManager();
        ABBClass reservations = (ABBClass) cvsManager.ReadText("test/Booking_hotel_reservations.csv");
        
        cvsManager.WriteText("test/Booking_hotel_reservations.csv", reservations);
        reservations.searchId(reservations.getRoot(), 10021555);
//        System.out.println("");
//        reservations.searchId(reservations.getRoot(), 17260509);
////        System.out.println("");
////        cvsManager.ReadText("test/Booking_hotel_historic.csv");
////        System.out.println("");
//        List rooms = (List) cvsManager.ReadText("test/Booking_hotel_rooms.csv");
////        rooms.printList();
//        System.out.println("");
//        HashTableClass status = (HashTableClass) cvsManager.ReadText("test/Booking_hotel_status.csv");
//        Guest carlos1 = new Guest("carlos", "marcano");
//        Guest carlos2 = new Guest("carlos", "marcano");
//        Guest migue = new Guest("Miguel", "Jiménez");
//
//        cvsManager.WriteText("test/Booking_hotel_status.csv", status);
//        status.printHashTable();
    }

}
