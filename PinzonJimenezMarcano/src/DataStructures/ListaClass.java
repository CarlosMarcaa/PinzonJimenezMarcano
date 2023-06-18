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
    
    public boolean isEmpty() {
        return getLength() == 0;
    }

    public int getLength() {
        return length;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }
    
    public void insertBegin(Object Element){
        Nodo nodo = new Nodo(Element);
        
        if (isEmpty()){
            setHead(nodo);
            
        }else{
            nodo.setNext(getHead());
            setHead(nodo);
            
        }
        length++;
    }
    
    public Nodo getIndex(int index){
        Nodo nodo = getHead();
        if (isEmpty()) {
            System.out.println("Nonexistent index");
            return nodo;
        }else{
            if (index<0 || index > length) {
                System.out.println("Nonexistent index");
                return nodo;
            }else{
                
                int counter = 0;
                while (counter != index){
                    counter++;
                    nodo = (Nodo) nodo.getNext();

                }    
                return nodo;
            
               
            }
        }    
    }
    
    public Nodo searchElement(Object elementToSearch){
        // Cuidado, posible nullpointer. Al momento de no encontrar el elemento en la lista, devuelve null.
        if (isEmpty()) {
            return null;
        }else{
            Nodo nodo = getHead();
            for (int i = 0; i < getLength(); i++){
                if ( nodo.getElement() == elementToSearch){
                    return nodo;
                }
            }
        }
        return null;
    }
    
    public void deleteElement(Object elementToDelete) {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        }else{
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
        
        previous.setNext(current.getNext());
        length--;
        
        }
    }
    
    public void printList(){
        Nodo nodo = getHead();
        while (nodo != null){
            System.out.print(" [" + nodo.getElement() + "]");
            nodo = (Nodo) nodo.getNext();
        }
    }
    
}
