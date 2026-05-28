/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueInDataStructure;

/**
 *
 * @author user
 */
public class CircularQueue {

    private int[] cirQue;
    private int rear;
    private int front;
    private int maxSize;
    private int count;

    public CircularQueue(int size) {
        this.maxSize = size;
        cirQue = new int[maxSize];
        rear = -1;
        front = 0;
        count = 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void enQ(int value) {
        if (isFull()) {
            return;
        }

        rear = (rear + 1) % maxSize;
        cirQue[rear] = value;
        count++;
    }

    public int deQ() {
        if (isEmpty()) {
            return -1;
        }

        int temp = cirQue[front];
        front = (front + 1) % maxSize;
        count--;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return cirQue[front];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        for (int c = 0; c < count; c++) {
            System.out.print(cirQue[i] + " <- ");
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }
}
