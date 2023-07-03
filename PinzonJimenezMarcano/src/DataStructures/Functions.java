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

    public static boolean dateExist(int day, int month, int year) {
        boolean fecha = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    fecha = leapYear((int) month, (int) day);
                } else {
                    fecha = notLeapYear((int) month, (int) day);
                }
            } else {
                fecha = leapYear((int) month, (int) day);
            }
        } else {
            fecha = notLeapYear((int) month, (int) day);
        }

        return fecha;
    }

    public static boolean leapYear(int month, int day) {

        boolean fecha = false;
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 2) {
            if (day >= 1 && day <= 29) {
                fecha = true;

            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                fecha = true;

            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                fecha = true;

            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                fecha = true;

            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                fecha = true;

            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        }
        return fecha;
    }

    public static boolean notLeapYear(int month, int day) {
        boolean fecha = false;

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                fecha = true;

            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                fecha = true;

            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                fecha = true;

            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                fecha = true;

            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                fecha = true;

            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                fecha = true;

            }
        }
        return fecha;
    }

    public static boolean GoodDate(int day3, int day4, int month3, int month4, int year3, int year4) {
        boolean dateExist1 = false;
        if (year4 > year3) {
            dateExist1 = dateExist(day3, month3, year3);
            if (dateExist1 == true) {
                dateExist1 = dateExist(day4, month4, year4);
            }
        } else if (year3 == year4) {
            if (month4 > month3) {
                dateExist1 = dateExist(day3, month3, year3);
                if (dateExist1 == true) {
                    dateExist1 = dateExist(day4, month4, year4);
                }
            } else if (month4 == month3) {
                if (day4 > day3) {
                    dateExist1 = dateExist(day3, month3, year3);
                    if (dateExist1 == true) {
                        dateExist1 = dateExist(day4, month4, year4);
                    }
                } else if (day3 == day4) {
                    dateExist1 = false;
                } else if (day3 > day4) {
                    dateExist1 = false;
                }
            } else if (month4 > month3) {
                dateExist1 = false;
            }
        } else if (year3 > year4) {
            dateExist1 = false;
        }
        return dateExist1;
    }

    public static boolean equalsDate(int day3, int day4, int month3, int month4, int year3, int year4) {
        boolean dateExist1 = false;
        if (year3 == year4) {
            if (month3 == month4) {
                if (day3 == day4) {
                    dateExist1 = dateExist(day3, month3, year3);
                    if (dateExist1 == true) {
                        dateExist1 = dateExist(day4, month4, year4);
                    }
                }
            }
        }
        return dateExist1;
    }

}
