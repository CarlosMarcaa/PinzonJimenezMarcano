/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pinzonjimenezmarcano;

import DataStructures.*;
import DataManagement.CsvManager;
import java.util.Scanner;

/**
 *
 * @author Carlos Marcano
 * @author Miguel Jiménez
 * @author Nicoll Pinzón
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CsvManager cvsManager = new CsvManager();
        ABBClass reservations = (ABBClass) cvsManager.ReadText("test/Booking_hotel_reservations.csv");
        ABBClass rooms = (ABBClass) cvsManager.ReadText("test/Booking_hotel_rooms.csv");
        ABBClass historic = (ABBClass) cvsManager.ReadText("test/Booking_hotel_historic.csv");
        HashTableClass status = (HashTableClass) cvsManager.ReadText("test/Booking_hotel_status.csv");

        while (true) {
            System.out.println("");
            System.out.print("Seleccione una opción: \n  1. Registro de clientes\n  2. Búsqueda de reservación\n  3. Histórico de habitaciones\n  4. Salir\n--> ");
            String selection = sc.next();
            if (selection.equals("1")) {
                System.out.print("1. Buscar Cliente\n2. Registrar Cliente\n3. Regresar\n--> ");
                String option = sc.next();
                if (option.equals("1")) {
                    System.out.print("  Nombre del cliente: ");
                    String name = sc.next();
                    System.out.print("  Apellido del cliente: ");
                    String lastName = sc.next();
                    System.out.print("Habitaciones encontradas: ");
                    System.out.println(status.getGuestRoom(name, lastName));
                }

            } else if (selection.equals("2")) {
                System.out.print("Ingrese la cédula del cliente: ");
                String id = sc.next();
                reservations.searchId(reservations.getRoot(), Integer.parseInt(id));

            } else if (selection.equals("3")) {
                System.out.print("Ingrese el número de habitación que desea consultar: ");
                String room = sc.next();
                if (Integer.parseInt(room) <= 300) {
                    historic.searchRoom(historic.getRoot(), Integer.parseInt(room)).printRoomHistory();
                } else{
                    System.out.println("Valor inválido");
                }

            } else if (selection.equals("4")) {
                System.out.println("Cu-Chao compa");
                break;
            }
        }
        
    }

}
