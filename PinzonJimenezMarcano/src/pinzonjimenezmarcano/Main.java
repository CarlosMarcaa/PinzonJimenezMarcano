/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pinzonjimenezmarcano;

import DataStructures.*;
import DataManagement.CsvManager;

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
//        reservations.preOrden(reservations.getRoot());

        reservations.searchId(reservations.getRoot(), 10021555);
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        cvsManager.ReadText("test/Booking_hotel_historic.csv");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        cvsManager.ReadText("test/Booking_hotel_rooms.csv");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        cvsManager.ReadText("test/Booking_hotel_status.csv");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

}
