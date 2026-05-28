package hashTable;

public class SortedLinkedList {

    class Node {

        Person data;
        Node next;

        public Node(Person data) {
            this.data = data;
        }
    }

    private Node first;

    // Insert
    public void insert(Person p) {

        Node newNode = new Node(p);

        Node previous = null;
        Node current = first;

        while (current != null
                && p.person_ID > current.data.person_ID) {

            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = newNode;
        } else {
            previous.next = newNode;
        }

        newNode.next = current;
    }

    // Find
    public Person find(int key) {

        Node current = first;

        while (current != null) {

            if (current.data.person_ID == key) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }

    // Delete
    public Person delete(int key) {

        Node previous = null;
        Node current = first;

        while (current != null
                && current.data.person_ID != key) {

            previous = current;
            current = current.next;
        }

        if (current == null) {
            return null;
        }

        if (previous == null) {
            first = first.next;
        } else {
            previous.next = current.next;
        }

        return current.data;
    }

    public void display() {

        Node current = first;

        while (current != null) {
            current.data.display();
            current = current.next;
        }
    }
}
