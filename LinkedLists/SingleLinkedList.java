package LinkedLists;

public class SingleLinkedList {

    private Node head;

    // IS EMPTY
    // Time Complexity: O(1)
    public boolean isEmpty() {

        return head == null;

    }

    // INSERT FIRST
    // Time Complexity: O(1)
    public void insertFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;

    }

    // APPEND
    // Time Complexity: O(n)
    public void append(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {

            head = newNode;
            return;

        }

        Node temp = head;

        while (temp.next != null) {

            temp = temp.next;

        }

        temp.next = newNode;

    }

    // INSERT BY POSITION
    // Time Complexity: O(n)
    public void insertByPosition(int data, int pos) {

        if (pos == 0) {

            insertFirst(data);
            return;

        }

        Node newNode = new Node(data);

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {

            temp = temp.next;

        }

        if (temp == null) {

            System.out.println("Invalid Position");
            return;

        }

        newNode.next = temp.next;

        temp.next = newNode;

    }

    // DELETE FIRST
    // Time Complexity: O(1)
    public void deleteFirst() {

        if (isEmpty()) {

            System.out.println("List is Empty");
            return;

        }

        head = head.next;

    }

    // DELETE LAST
    // Time Complexity: O(n)
    public void deleteLast() {

        if (isEmpty()) {

            System.out.println("List is Empty");
            return;

        }

        if (head.next == null) {

            head = null;
            return;

        }

        Node temp = head;

        while (temp.next.next != null) {

            temp = temp.next;

        }

        temp.next = null;

    }

    // DELETE BY VALUE
    // Time Complexity: O(n)
    public void delete(int value) {

        if (isEmpty()) {

            System.out.println("List is Empty");
            return;

        }

        if (head.data == value) {

            head = head.next;
            return;

        }

        Node current = head;
        Node previous = null;

        while (current != null
                && current.data != value) {

            previous = current;
            current = current.next;

        }

        if (current == null) {

            System.out.println("Item Not Found");
            return;

        }

        previous.next = current.next;

    }

    // FIND
    // Time Complexity: O(n)
    public Node find(int value) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == value) {

                return temp;

            }

            temp = temp.next;

        }

        return null;

    }

    // COUNT
    // Time Complexity: O(n)
    public int count() {

        int c = 0;

        Node temp = head;

        while (temp != null) {

            c++;

            temp = temp.next;

        }

        return c;

    }

    // DISPLAY
    // Time Complexity: O(n)
    public void display() {

        if (isEmpty()) {

            System.out.println("List is Empty");
            return;

        }

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;

        }

        System.out.println("null");

    }

    // MAIN METHOD
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        // APPEND
        list.append(10);
        list.append(20);
        list.append(30);

        list.display();

        // INSERT FIRST
        list.insertFirst(5);

        list.display();

        // INSERT BY POSITION
        list.insertByPosition(15, 2);

        list.display();

        // DELETE FIRST
        list.deleteFirst();

        list.display();

        // DELETE LAST
        list.deleteLast();

        list.display();

        // DELETE BY VALUE
        list.delete(15);

        list.display();

        // FIND
        Node found = list.find(20);

        if (found != null) {

            System.out.println("Found");

        } else {

            System.out.println("Not Found");

        }

        // COUNT
        System.out.println("Count = " + list.count());

    }
}
