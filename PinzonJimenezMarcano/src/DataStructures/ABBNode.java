/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Objects.Guest;
import Objects.Room;

/**
 *
 * @author Carlol
 */
public class ABBNode {

    private ABBNode rightSon;
    private ABBNode leftSon;
    private int element;
    private Guest guest;
    private Room room;

    public ABBNode(Guest guest, Room room) {
        if (guest != null) {
            this.element = guest.getId();
        } else if (guest == null) {
            this.element = room.getRoomNumber();
        }

        this.leftSon = null;
        this.rightSon = null;
        this.guest = guest;
        this.room = room;
    }
    // Verifies if the node is a leaf
    public boolean isLeaf() {
        return (getRightSon() == null && getLeftSon() == null);
    }
    // Returns the right son
    public ABBNode getRightSon() {
        return rightSon;
    }
    // Changes the value of the right son
    public void setRightSon(ABBNode rightSon) {
        this.rightSon = rightSon;
    }
    // Returns the left son
    public ABBNode getLeftSon() {
        return leftSon;
    }
    // Changes the value of the left son
    public void setLeftSon(ABBNode leftSon) {
        this.leftSon = leftSon;
    }
    //Returns the element of the node
    public int getElement() {
        return element;
    }
    // Returns the guest of the node
    public Guest getGuest() {
        return guest;
    }
    // Returns the room of the node
    public Room getRoom() {
        return room;
    }

}
