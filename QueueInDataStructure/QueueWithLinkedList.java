/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueInDataStructure;

/**
 *
 * @author user
 */
public class QueueWithLinkedList {

    Node front;
    Node rear;

    public boolean isEmpty() {
        return rear == null;
    }

    public void EnQue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int DeQue() {
        if (isEmpty())return -1;
        
         Node temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return temp.data;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return front.data;
    }

}
