/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DataStructures;

/**
 *
 * @author Carlol
 */
public class ABBNode {
    private ABBNode rightSon;
    private ABBNode leftSon;
    private int element;

    public ABBNode(int element) {
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }
    
    public boolean isLeaf(){
        return (getRightSon() == null && getLeftSon() == null);
    }

    public ABBNode getRightSon() {
        return rightSon;
    }

    public void setRightSon(ABBNode rightSon) {
        this.rightSon = rightSon;
    }

    public ABBNode getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(ABBNode leftSon) {
        this.leftSon = leftSon;
    }

    public int getElement() {
        return element;
    }
    
    
    
}
