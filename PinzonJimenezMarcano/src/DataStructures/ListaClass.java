/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Carlos Marcano
 */
public class ListaClass {

    private int length;
    private Nodo head;

    public ListaClass() {
        this.length = 0;
        this.head = null;
    }
    
    // Verifies if the list does not contain any nodes
    public boolean isEmpty() {
        return getLength() == 0;
    }
    
    // Returns the length of the list
    public int getLength() {
        return length;
    }
    
    // Returns the head of the list
    public Nodo getHead() {
        return head;
    }
    
    // Changes the head of the list
    public void setHead(Nodo head) {
        this.head = head;
    }
    
    // Inserts and element in the beginning of the list
    public void insertBegin(Object Element) {
        Nodo nodo = new Nodo(Element);

        if (isEmpty()) {
            setHead(nodo);

        } else {
            nodo.setNext(getHead());
            setHead(nodo);

        }
        length++;
    }

    // Returns the node in the specified index
    public Nodo getIndex(int index) {
        Nodo nodo = getHead();
        if (isEmpty()) {
            return nodo;
        } else {
            if (index < 0 || index > length) {
                System.out.println("Nonexistent index");
                return nodo;
            } else {

                int counter = 0;
                while (counter != index) {
                    counter++;
                    nodo = (Nodo) nodo.getNext();

                }
                return nodo;

            }
        }
    }

    // Searches and returns an element from the list if it exist in the list
    public Nodo searchElement(Object elementToSearch) {
        // Cuidado, posible nullpointer. Al momento de no encontrar el elemento en la lista, devuelve null.
        if (isEmpty()) {
            return null;
        } else {
            Nodo nodo = getHead();
            for (int i = 0; i < getLength(); i++) {
                if (nodo.getElement() == elementToSearch) {
                    return nodo;
                }
            }
        }
        return null;
    }

    // Deletes an element from the list
    public void deleteElement(Object elementToDelete) {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            // Si el elemento a eliminar es el primer nodo
            if (getHead() == elementToDelete) {
                setHead(getHead().getNext());
                length--;
                return;
            }

            Nodo current = getHead();
            Nodo previous = null;

            // Buscar el nodo que contiene el valor a eliminar
            while (current != null && current.getElement() != elementToDelete) {
                previous = current;
                current = current.getNext();

            }

            // Si el valor no se encuentra en la lista
            if (current == null) {
                System.out.println("Element " + elementToDelete + " not found in the list");
                return;
            }

            // Eliminar el nodo
            if (previous != null) {
                previous.setNext(current.getNext());
            } else {
                setHead(null);
            }
            length--;

        }
    }

    // Prints the list (Only for developing usage)
    public void printList() {
        Nodo nodo = getHead();
        while (nodo != null) {
            System.out.print(" [" + nodo.getElement() + "]");
            nodo = (Nodo) nodo.getNext();
        }
    }

}
