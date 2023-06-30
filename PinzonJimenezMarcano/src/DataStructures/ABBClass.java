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

    public Object searchId(ABBNode root, int id) {
        Object guest_find = new Object();
        if (root != null) {
            if (id == root.getElement()) {
                root.getGuest().printGuest();
            } else {
                if (id < root.getElement()) {
                    if (root.getLeftSon() != null) {
                        searchId(root.getLeftSon(), id);
                    }
                } else {
                    if (root.getRightSon() != null) {
                        searchId(root.getRightSon(), id);
                    }
                }
            }
        }
    }

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
}
