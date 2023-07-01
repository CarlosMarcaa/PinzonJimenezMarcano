/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Objects.Guest;
import Objects.Room;

/**
 *
 * @author Carlos Marcano
 * @author Miguel Jiménez
 */
public class ABBClass {

    private ABBNode root;
    String guest_find = "";
    Guest guestFind;
    boolean flag = false;
    Functions verifyDateExits = new Functions();
    

    public ABBClass() {
        this.root = null;
    }

    public ABBNode getRoot() {
        return root;
    }

    public void setRoot(ABBNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(Object element, ABBNode root) {
        if (element instanceof Guest) {
            ABBNode nodo = new ABBNode((Guest) element, null);

            if (isEmpty()) {
                setRoot(nodo);
            } else {
                if (nodo.getElement() < root.getElement()) {
                    if (root.getLeftSon() == null) {
                        root.setLeftSon(nodo);
                    } else {
                        insert((Guest) element, root.getLeftSon());
                    }
                } else {

                    if (root.getRightSon() == null) {
                        root.setRightSon(nodo);
                    } else {
                        insert((Guest) element, root.getRightSon());
                    }
                }
            }
        } else {
            ABBNode nodo = new ABBNode(null, (Room) element);

            if (isEmpty()) {
                setRoot(nodo);
            } else {
                if (nodo.getElement() < root.getElement()) {
                    if (root.getLeftSon() == null) {
                        root.setLeftSon(nodo);
                    } else {
                        insert((Room) element, root.getLeftSon());
                    }
                } else {

                    if (root.getRightSon() == null) {
                        root.setRightSon(nodo);
                    } else {
                        insert((Room) element, root.getRightSon());
                    }
                }
            }
        }
    }

    public void delete(int element, ABBNode previousNode, ABBNode root) {

        if (isEmpty()) {
            System.out.println("The tree is empty");
        } else {
            if (element != root.getElement()) {
                if (element < root.getElement()) {
                    delete(element, root, root.getLeftSon());
                } else {
                    delete(element, root, root.getRightSon());
                }
            } else {
                //The root is leaf
                if (root.isLeaf()) {
                    if (previousNode == null) {
                        root = null;
                    } else {
                        if (element > previousNode.getElement()) {
                            previousNode.setRightSon(null);
                        } else {
                            previousNode.setLeftSon(null);
                        }
                    }
                }

                //The root only has right son
                if (root.getLeftSon() == null && root.getRightSon() != null) {
                    if (previousNode == null) {
                        setRoot(root.getRightSon());
                    } else {
                        if (element > previousNode.getElement()) {
                            previousNode.setRightSon(root.getRightSon());
                        } else {
                            previousNode.setLeftSon(root.getRightSon());
                        }
                    }
                }

                //The root only has left son
                if (root.getRightSon() == null && root.getLeftSon() != null) {
                    if (previousNode == null) {
                        setRoot(root.getLeftSon());
                    } else {
                        if (element > previousNode.getElement()) {
                            previousNode.setRightSon(root.getLeftSon());
                        } else {
                            previousNode.setLeftSon(root.getLeftSon());
                        }
                    }
                }

                //The root has both sons
                if (root.getRightSon() != null && root.getLeftSon() != null) {
                    ABBNode replacement = searchReplacementNode(root.getLeftSon());
                    if (previousNode == null) {
                        setRoot(replacement);
                    } else {
                        if (replacement.getElement() > previousNode.getElement()) {
                            previousNode.setRightSon(replacement);
                        } else {
                            previousNode.setLeftSon(replacement);
                        }
                    }
                    if (root.getLeftSon() != replacement) {
                        replacement.setLeftSon(root.getLeftSon());
                        replacement.setRightSon(root.getRightSon());
                    } else {
                        replacement.setRightSon(root.getRightSon());
                    }
                }
            }

        }

    }

    public void preOrden(ABBNode nodo) {
        if (nodo != null) {
            System.out.print(" [" + nodo.getElement() + "]");
            preOrden(nodo.getLeftSon());
            preOrden(nodo.getRightSon());
        }
    }

    public void inOrden(ABBNode nodo) {
        if (nodo != null) {
            preOrden(nodo.getLeftSon());
            System.out.print(" [" + nodo.getElement() + "]");
            preOrden(nodo.getRightSon());
        }
    }

    public void postOrden(ABBNode nodo) {
        if (nodo != null) {
            preOrden(nodo.getLeftSon());
            preOrden(nodo.getRightSon());
            System.out.print(" [" + nodo.getElement() + "]");
        }
    }

    public String searchId(ABBNode root, int id) {
        if (root != null) {
            if (id == root.getElement()) {
               return root.getGuest().information();
            }
        } else {
            if (id < root.getElement()) {
                if (root.getLeftSon() != null) {
                    return searchId(root.getLeftSon(), id);
                }
            } else {
                if (root.getRightSon() != null) {
                   return searchId(root.getRightSon(), id);
                }
            }
        }
        return "";
    }
    
    public Guest searchIdCheck(ABBNode root, int id) {
       
        if (root != null) {
            if (id == root.getElement()) {
                guestFind = root.getGuest();
                return root.getGuest();
            }
        } else {
            if (id < root.getElement()) {
                if (root.getLeftSon() != null) {
                    return searchIdCheck(root.getLeftSon(), id);
                }
            } else {
                if (root.getRightSon() != null) {
                    return searchIdCheck(root.getRightSon(), id);
                }
            }
        }return null;
        
    }

   
//    public Guest searchEmailCheck(ABBNode root, String email) {
//        
//        if (root != null) {
//            if (email == root.getGuest().getEmail()) {
//                return root.getGuest();
//            }
//        
//           
//                    return searchEmailCheck(root.getLeftSon(), email);
//                
//            
//                   return searchEmailCheck(root.getRightSon(), email);
//               
//            
//        }
//        return null;
//    }
    
//    public void CheckOutAutomatic(String date, String dateToday,ABBNode root, int id,

    public Room searchRoom(ABBNode root, int room) {
        if (root != null) {
            if (room == root.getRoom().getRoomNumber()) {
//                root.getRoom().printRoom();
//                System.out.println("");
                return root.getRoom();
            } else {
                if (room < root.getRoom().getRoomNumber()) {
                    if (root.getLeftSon() != null) {
                        return searchRoom(root.getLeftSon(), room);
//                        
                    }
                } else {
                    if (root.getRightSon() != null) {
                        return searchRoom(root.getRightSon(), room);
                    }
                }
            }
        }
        return null;
    }

    public ABBNode searchReplacementNode(ABBNode selected) {
        while (selected.getRightSon() != null) {
            selected = selected.getRightSon();
        }
        return selected;
    }
    public boolean searchIfisInHistoric(ABBNode nodo, int id) {
        
            if (nodo != null) {
                if (nodo.getGuest().getId()== id){
                    flag = true;}

                searchIfisInHistoric(nodo.getLeftSon(), id);
                searchIfisInHistoric(nodo.getRightSon(), id);
            }return flag;
        
    }
    public void searchInHistoric(ABBNode nodo, String day1,String month1,String year1, ABBClass reservationsHistory, HashTableClass status) {
        boolean dateExist = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean dateExist2 = false;
            if (nodo.getGuest() != null) {
                String[] dateGuest = nodo.getGuest().getArrival().split("/");

                char day6 = day1.charAt(0);

                char day5 = dateGuest[0].charAt(0);
                int day3 = 0;
                int day4 = 0;

                if ((Integer.parseInt(Integer.toString(day6)) == 0) || (Integer.parseInt(Integer.toString(day5)) == 0)) {
                    if (Integer.parseInt(Integer.toString(day5)) == 0) {

                        day3 = Integer.parseInt(dateGuest[0].substring(1));
                        if (Integer.parseInt(Integer.toString(day6)) == 0) {
                            day4 = Integer.parseInt(day1.substring(1));
                        } else {
                            day4 = Integer.parseInt(day1);
                        }
                    } else if (Integer.parseInt(Integer.toString(day6)) == 0) {
                        day4 = Integer.parseInt(day1.substring(1));
                        if (Integer.parseInt(Integer.toString(day5)) == 0) {
                            day3 = Integer.parseInt(dateGuest[0].substring(1));

                        } else {
                            day3 = Integer.parseInt(dateGuest[0]);
                        }
                    }
                } else {
                    day4 = Integer.parseInt(day1);
                    day3 = Integer.parseInt(dateGuest[0]);
                }

                char month6 = month1.charAt(0);

                char month5 = dateGuest[1].charAt(0);
                int month3 = 0;
                int month4 = 0;

                if ((Integer.parseInt(Integer.toString(month6)) == 0) || (Integer.parseInt(Integer.toString(month5)) == 0)) {
                    if (Integer.parseInt(Integer.toString(month5)) == 0) {

                        month3 = Integer.parseInt(dateGuest[1].substring(1));
                        if (Integer.parseInt(Integer.toString(month6)) == 0) {
                            month4 = Integer.parseInt(month1.substring(1));
                        } else {
                            month4 = Integer.parseInt(month1);
                        }
                    } else if (Integer.parseInt(Integer.toString(month6)) == 0) {
                        month4 = Integer.parseInt(month1.substring(1));
                        if (Integer.parseInt(Integer.toString(month5)) == 0) {
                            month3 = Integer.parseInt(dateGuest[1].substring(1));

                        } else {
                            month3 = Integer.parseInt(dateGuest[1]);
                        }
                    }
                } else {
                    month4 = Integer.parseInt(month1);
                    month3 = Integer.parseInt(dateGuest[1]);
                }

                int year4 = Integer.parseInt(year1);
                int year3 = Integer.parseInt(dateGuest[2]);
                if ((year3 <= 9999 && year3 >= 2000) || (year4 <= 9999 && year4 >= 2000)) {
                    dateExist = verifyDateExits.equalsDate(day3, day4, month3, month4, year3, year4);
                    dateExist2 = verifyDateExits.GoodDate(day3, day4, month3, month4, year3, year4);
                }
                
                if(dateExist == true || dateExist2 == false){
                    Object guestNew = reservationsHistory.searchEmailCheck(reservationsHistory.getRoot(), nodo.getGuest().getEmail());
                                if (guestNew != null) {
                                    String[] dateGuest1 = nodo.getGuest().getCheckout().split("/");

                                    day5 = dateGuest1[0].charAt(0);
                                    day3 = 0;
                                    day4 = 0;

                                    if ((Integer.parseInt(Integer.toString(day6)) == 0) || (Integer.parseInt(Integer.toString(day5)) == 0)) {
                                        if (Integer.parseInt(Integer.toString(day5)) == 0) {

                                            day3 = Integer.parseInt(dateGuest1[0].substring(1));
                                            if (Integer.parseInt(Integer.toString(day6)) == 0) {
                                                day4 = Integer.parseInt(day1.substring(1));
                                            } else {
                                                day4 = Integer.parseInt(day1);
                                            }
                                        } else if (Integer.parseInt(Integer.toString(day6)) == 0) {
                                            day4 = Integer.parseInt(day1.substring(1));
                                            if (Integer.parseInt(Integer.toString(day5)) == 0) {
                                                day3 = Integer.parseInt(dateGuest1[0].substring(1));

                                            } else {
                                                day3 = Integer.parseInt(dateGuest1[0]);
                                            }
                                        }
                                    } else {
                                        day4 = Integer.parseInt(day1);
                                        day3 = Integer.parseInt(dateGuest1[0]);
                                    }

                                    month6 = month1.charAt(0);

                                    month5 = dateGuest1[1].charAt(0);
                                    month3 = 0;
                                    month4 = 0;

                                    if ((Integer.parseInt(Integer.toString(month6)) == 0) || (Integer.parseInt(Integer.toString(month5)) == 0)) {
                                        if (Integer.parseInt(Integer.toString(month5)) == 0) {

                                            month3 = Integer.parseInt(dateGuest1[1].substring(1));
                                            if (Integer.parseInt(Integer.toString(month6)) == 0) {
                                                month4 = Integer.parseInt(month1.substring(1));
                                            } else {
                                                month4 = Integer.parseInt(month1);
                                            }
                                        } else if (Integer.parseInt(Integer.toString(month6)) == 0) {
                                            month4 = Integer.parseInt(month1.substring(1));
                                            if (Integer.parseInt(Integer.toString(month5)) == 0) {
                                                month3 = Integer.parseInt(dateGuest1[1].substring(1));

                                            } else {
                                                month3 = Integer.parseInt(dateGuest1[1]);
                                            }
                                        }
                                    } else {
                                        month4 = Integer.parseInt(month1);
                                        month3 = Integer.parseInt(dateGuest1[1]);
                                    }

                                    year4 = Integer.parseInt(year1);
                                    year3 = Integer.parseInt(dateGuest1[2]);
                                    flag2 = verifyDateExits.GoodDate(day3, day4, month3, month4, year3, year4);
                                    flag3 = verifyDateExits.equalsDate(day3, day4, month3, month4, year3, year4);
                                    if (flag2 == true || flag3 == true) {
                                       status.put(nodo.getGuest(), nodo.getGuest().getRoom());
                                    }
                    
                }else {
                                    nodo.getGuest().setPhone("");
                                    status.put(nodo.getGuest(), nodo.getGuest().getRoom());}}

//                wr.append(String.valueOf(nodo.getGuest().getId()) + "," + nodo.getGuest().getFirstName() + ","
//                        + nodo.getGuest().getLastName() + "," + nodo.getGuest().getEmail() + "," + nodo.getGuest().getGender() + ","
//                        + nodo.getGuest().getRoomType() + "," + nodo.getGuest().getPhone() + "," + nodo.getGuest().getArrival() + ","
//                        + nodo.getGuest().getCheckout() + "\n");

                searchInHistoric(nodo.getLeftSon(), day1,month1, year1,  reservationsHistory, status);
                searchInHistoric(nodo.getRightSon(),  day1,month1,year1,  reservationsHistory, status);
            }
        
    }
}
