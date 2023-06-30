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

    public boolean isLeaf() {
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

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

}
