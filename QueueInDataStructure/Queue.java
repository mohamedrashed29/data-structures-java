/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueInDataStructure;

/**
 *
 * @author user
 */
public class Queue {

    private int front;
    private int rear;
    private int queue[];
    private int maxSize;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public void EnQ(int item) {
        if (isFull()) {
            System.out.println("sry is full");;
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = item;
        nItems++;
    }

    public int DeQ() {
        if (isEmpty()) {
            return -1;
        }
        int temp = queue[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int peekFront() {
        return queue[front];
    }

    
}
