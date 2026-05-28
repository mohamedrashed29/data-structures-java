package QueueInDataStructure;

public class deque {

    private String[] arr;
    private int size;
    private int front;
    private int rear;
    private int nElements;

    public deque(int size) {

        this.size = size;
        arr = new String[size];
        front = 0;
        rear = -1;
        nElements = 0;

    }

    public boolean isEmpty() {
        return nElements == 0;
    }

    public boolean isFull() {
        return nElements == size;
    }

    public void insertLast(String word) {
        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }

        // Wrap Around
        if (rear == size - 1) {

            rear = -1;

        }

        arr[++rear] = word;

        nElements++;

    }

    public void insertFirst(String word) {

        if (isFull()) {
            System.out.println("Deque is Full");
            return;

        }

        // Wrap Around
        if (front == 0) {

            front = size;

        }

        arr[--front] = word;

        nElements++;

    }

    public String deleteFirst() {

        if (isEmpty()) {

            return null;

        }

        String temp = arr[front];

        front++;

        // Wrap Around
        if (front == size) {

            front = 0;

        }

        nElements--;

        return temp;

    }

    public String deleteLast() {

        if (isEmpty()) {

            return null;

        }

        String temp = arr[rear];

        rear--;

        // Wrap Around
        if (rear < 0) {

            rear = size - 1;

        }

        nElements--;

        return temp;

    }

    public String peekFirst() {

        if (isEmpty()) {

            return null;

        }

        return arr[front];

    }

    public String peekLast() {

        if (isEmpty()) {
            return null;
        }
        return arr[rear];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        int current = front;

        for (int i = 0; i < nElements; i++) {

            System.out.print(arr[current] + " ");

            current++;

            if (current == size) {

                current = 0;

            }

        }

        System.out.println();

    }

    public static void main(String[] args) {

        deque dq = new deque(5);

        dq.insertLast("A");

        dq.insertLast("B");

        dq.insertLast("C");

        dq.display();

        dq.insertFirst("X");

        dq.display();

        dq.deleteFirst();

        dq.display();

        dq.deleteLast();

        dq.display();

    }

}
