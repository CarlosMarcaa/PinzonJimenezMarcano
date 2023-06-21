/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagement;

import DataStructures.HashTableClass;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Miguel
 */
public class CsvManager {
    
    public void ReadText(String path) {
        HashTableClass hashTable = new HashTableClass(300);
        
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
                    if (path.equals("test/Booking_hotel_reservations.csv") && !data_split[i].equals("ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida")) {
                        System.out.println(data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ", " + data[4] + ", " + data[5] + ", " + data[6] + ", " + data[7] + ", " + data[8]);
                    } else if (path.equals("test/Booking_hotel_status.csv") && !data_split[i].equals("num_hab,primer_nombre,apellido,email,genero,celular,llegada")) {
                        System.out.println(data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ", " + data[4] + ", " + data[5] + ", " + data[6]);
                        if (!data[0].equals("")) {
                            hashTable.put(data[1], data[2], Integer.parseInt(data[0]));
                        }                        
                    } else if (path.equals("test/Booking_hotel_rooms.csv") && !data_split[i].equals("num_hab,tipo_hab,piso")) {
                        System.out.println(data[0] + ", " + data[1] + ", " + data[2]);
                    } else if (path.equals("test/Booking_hotel_historic.csv") && !data_split[i].equals("ci,primer_nombre,apellido,email,genero,llegada,num_hab")) {
                        System.out.println(data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ", " + data[4] + ", " + data[5] + ", " + data[6]);
                    }
                }
//                hashTable.printHashTable();
            } 
            
            lector.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void WriteText(String path) {
        
    }
}
