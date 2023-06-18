/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DataStructures;

/**
 *
 * @author Carlol
 */
public class Functions {
    
    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Si la entrada es nula o vacía, se devuelve tal cual
        }

        String firstLetter = input.substring(0, 1).toUpperCase(); // Obtener la primera letra en mayúscula
        String restOfString = input.substring(1).toLowerCase(); // Convertir el resto del string a minúsculas

        return firstLetter + restOfString; // Combinar la primera letra en mayúscula con el resto en minúsculas
    }

    
}
