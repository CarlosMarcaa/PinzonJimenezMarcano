package DataStructures;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Miguel
 */
public class Nodo {
    private Object element;
    private Nodo next;

    public Nodo(Object element) {
        this.element = element;
        this.next = null;
    }
    
    // Returns the element of the node
    public Object getElement() {
        return element;
    }
    
    // Changes the element of the node
    public void setElement(Object element) {
        this.element = element;
    }

    // Returns the following node
    public Nodo getNext() {
        return next;
    }
    
    // Changes the following node
    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
    
    
}
