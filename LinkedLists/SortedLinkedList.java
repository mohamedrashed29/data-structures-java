package LinkedLists;

import LinkedLists.Node;

public class SortedLinkedList {

    private Node head;

   
    public boolean isEmpty() {

        return head == null;

    }

  
    // INSERT
    // Time Complexity: O(n)
   
    public void insert(int value) {

        Node newNode = new Node(value);

        Node previous = null;
        Node current = head;

        // Find correct position
        while (current != null
                && value < current.data) {

            previous = current;
            current = current.next;

        }

        // Insert at first
        if (previous == null) {
            
            newNode.next = head;
            head = newNode;
            return ;

        } 

        previous.next = newNode;
        newNode.next = current;

    }

   
    // REMOVE FIRST
    // Time Complexity: O(1)
    
    public Node remove() {

        if (isEmpty()) {

            System.out.println("List is Empty");
            return null;

        }

        Node temp = head;

        head = head.next;

        return temp;

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

    // Remove by value 
    public Node deleteVal(int val){
        if(isEmpty()) return null;
        Node temp = null;
        Node current = head;
        Node pre = null;
        
        while(current != null){
            if(current.data == val){
                if(pre == null){
                    temp = head;
                    head = head.next;
                    return temp;
                }
                temp = current;
                pre.next = current.next;
                return temp;
            }
            
            pre = current;
            current = current.next;
            
        }
        return temp;
    }
    
   
 
    public static void main(String[] args) {

        SortedLinkedList list = new SortedLinkedList();

        // Insert elements
        list.insert(30);
        list.insert(10);
        list.insert(20);
        list.insert(5);
        list.insert(40);

        System.out.println("Sorted Linked List:");

        list.display();

        // Remove first
        Node removed = list.remove();

        if (removed != null) {

            System.out.println("Removed: " + removed.data);

        }

        System.out.println("After Remove:");

        list.display();

    }
}