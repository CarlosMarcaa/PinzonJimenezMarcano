/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pinzonjimenezmarcano;

import DataStructures.*;
import DataManagement.CsvManager;
import Interface.Menu;
import Objects.Guest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import Interface.Menu;

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
        Menu menu = new Menu();
//        Scanner sc = new Scanner(System.in);
//        CsvManager cvsManager = new CsvManager();
//        ABBClass reservations = (ABBClass) cvsManager.ReadText("test/Booking_hotel_reservations.csv");
////        ABBClass reservationsHistory = (ABBClass) cvsManager.ReadText("test/Booking_hotel_reservations_1.csv");
//        ABBClass rooms = (ABBClass) cvsManager.ReadText("test/Booking_hotel_rooms.csv");
//        ABBClass historic = (ABBClass) cvsManager.ReadText("test/Booking_hotel_historic.csv");
//        HashTableClass status = (HashTableClass) cvsManager.ReadText("test/Booking_hotel_status.csv");
//        while (true) {
//            System.out.println("");
//            System.out.print("Seleccione una opción: \n  1. Registro de clientes\n  2. Búsqueda de reservación\n  3. Histórico de habitaciones\n  4. Check In\n  5. Check Out\n  6. Salir\n--> ");
//            String selection = sc.next();
//            if (selection.equals("1")) {
//                System.out.print("1. Buscar Cliente\n2. Registrar Cliente\n3. Regresar\n--> ");
//                String option = sc.next();
//                if (option.equals("1")) {
//                    System.out.print("  Nombre del cliente: ");
//                    String name = sc.next();
//                    System.out.print("  Apellido del cliente: ");
//                    String lastName = sc.next();
//                    System.out.print("Habitaciones encontradas: ");
//                    System.out.println(status.getGuestRoom(name, lastName));
//                } else if (option.equals("2")) {
//
//                } else {
//                    System.out.println("Te equivocaste mano, coloca el número que es");
//                }
//
//            } else if (selection.equals("2")) {
//                System.out.print("Ingrese la cédula del cliente: ");
//                String id = sc.next();
//                reservations.searchId(reservations.getRoot(), Integer.parseInt(id));
//
//            } else if (selection.equals("3")) {
//                System.out.print("Ingrese el número de habitación que desea consultar: ");
//                String room = sc.next();
//                if (Integer.parseInt(room) <= 300) {
//                    historic.searchRoom(historic.getRoot(), Integer.parseInt(room)).stringRoomHistory();
//                } else {
//                    System.out.println("Valor inválido");
//                }
//
//            } else if (selection.equals("4")) {
////                Verifica que exista en las reservas
//                System.out.print("Ingrese la cédula del cliente: ");
//                String id = sc.next();
//                Guest guest = reservations.searchId(reservations.getRoot(), Integer.parseInt(id));
//
//                LocalDate today = LocalDate.now(); //fecha de hoy
//                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //ejemplo de como se hace el formato de fecha
//                System.out.println(today.format(dateFormat)); //imprime la fecha con el formato del trabajo
//                System.out.println(LocalDate.parse(guest.getArrival(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//
////                Verifica que la fecha de la reserva coincide con la del día de hoy 
//                if (LocalDate.parse(guest.getArrival(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).equals(today)) {
//                    System.out.println("Bieeen");
////                    Agrega al usuario a status
//                    guest.setRoom(1);
//                    status.put(guest, guest.getRoom());
//
//                    reservations.delete(guest.getId(), null, reservations.getRoot());
//                }
//
//            } else if (selection.equals("5")) {
//            } else if (selection.equals("6")) {
//                System.out.println("Cu-Chao compa");
////                cvsManager.WriteText("test/Booking_hotel_reservations.csv", reservations);
////                cvsManager.WriteText("test/Booking_hotel_status.csv", status);
//                
//                break;
//            }
        }
    

}
