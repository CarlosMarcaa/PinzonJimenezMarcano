/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagement;

import DataStructures.ABBClass;
import Objects.Guest;
import DataStructures.HashTableClass;
import DataStructures.List;
import DataStructures.Nodo;
import Objects.Room;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Miguel Jiménez
 */
public class CsvManager {

    public Object ReadText(String path) {
        ABBClass tree = new ABBClass();
        List roomList = new List();
        HashTableClass hashTable = new HashTableClass(301);

        File cvsFile = new File(path);
        BufferedReader lector;

        String line;
        String data_cvs = "";

        try {
            lector = new BufferedReader(new FileReader(cvsFile));
            while ((line = lector.readLine()) != null) {
                if (!line.isEmpty()) {
                    data_cvs += line + "\n";
                }
            }

            if (!"".equals(data_cvs)) {
                String[] data_split = data_cvs.split("\n");
                for (int i = 0; i < data_split.length; i++) {
                    String[] data = data_split[i].split("(,|, )");
//                    RESERVATIONS
                    if (path.equals("test/Booking_hotel_reservations.csv") && !data_split[i].equals("ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida")) {
//                        System.out.println(data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ", " + data[4] + ", " + data[5] + ", " + data[6] + ", " + data[7] + ", " + data[8]);
                        Guest guest = new Guest(data[1], data[2]);
                        guest.setId(idToInt(data[0]));
                        guest.setEmail(data[3]);
                        guest.setArrival(data[7]);
                        guest.setCheckout(data[8]);
                        guest.setGender(data[4]);
                        guest.setPhone(data[6]);
                        guest.setRoomType(data[5]);
                        tree.insert(guest, tree.getRoot());
                    } //                    STATUS
                    else if (path.equals("test/Booking_hotel_status.csv") && !data_split[i].equals("num_hab,primer_nombre,apellido,email,genero,celular,llegada")) {
//                        System.out.println(data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ", " + data[4] + ", " + data[5] + ", " + data[6]);
                        if (!data[0].equals("")) {
                            Guest guest = new Guest(data[1], data[2]);
                            guest.setRoom(Integer.parseInt(data[0]));
                            guest.setEmail(data[3]);
                            guest.setGender(data[4]);
                            guest.setPhone(data[5]);
                            guest.setArrival(data[6]);
                            hashTable.put(guest, guest.getRoom());
                        }
                    } //                    ROOMS
                    else if (path.equals("test/Booking_hotel_rooms.csv") && !data_split[i].equals("num_hab,tipo_hab,piso")) {
//                        System.out.println(data[0] + ", " + data[1] + ", " + data[2]);
                        Room room = new Room(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
//                        room.printRoom();
                        roomList.insertFinal(room);

                    } //                    HISTORIC
                    else if (path.equals("test/Booking_hotel_historic.csv") && !data_split[i].equals("ci,primer_nombre,apellido,email,genero,llegada,num_hab")) {
//                        System.out.println(data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ", " + data[4] + ", " + data[5] + ", " + data[6]);\
                        Guest guest = new Guest(data[1], data[2]);
                        guest.setId(idToInt(data[0]));
                        guest.setEmail(data[3]);
                        guest.setGender(data[4]);
                        guest.setArrival(data[5]);
                        guest.setRoom(Integer.parseInt(data[6]));
//                        guest.printGuest();
                    }
                }
            }

            lector.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        if (null != path) {
            switch (path) {
                case "test/Booking_hotel_reservations.csv":
                    return tree;
                case "test/Booking_hotel_status.csv":
                    return hashTable;
                case "test/Booking_hotel_rooms.csv":
                    return roomList;
                default:
                    break;
            }
        }
        return null;
    }

    public int idToInt(String idString) {
        String[] temp = idString.split("\\.");
        if (temp.length == 2) {
            idString = temp[0] + temp[1];
        } else if (temp.length == 3) {
            idString = temp[0] + temp[1] + temp[2];
        }

        int intId = Integer.parseInt(idString);
        return intId;
    }

    public void WriteText(String path, Object element) {
        try {
            FileWriter w = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            if ("test/Booking_hotel_status.csv".equals(path)) {
                wr.append("num_hab,primer_nombre,apellido,email,genero,celular,llegada\n");
                HashTableClass table = (HashTableClass) element;
                for (int i = 0; i < table.getTableSize(); i++) {
                    if (table.getTable()[i] != null) {
                        Nodo pointer = table.getTable()[i].getHead();

                        while (pointer != null) {
                            Guest guestToAppend = (Guest) pointer.getElement();
                            wr.append(String.valueOf(guestToAppend.getRoom()) + "," + guestToAppend.getFirstName() + "," + guestToAppend.getLastName() + "," + guestToAppend.getEmail() + "," + guestToAppend.getGender() + "," + guestToAppend.getPhone() + "," + guestToAppend.getArrival() + "\n");
                            pointer = pointer.getNext();
                        }
                    }
                }
            }
            wr.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
