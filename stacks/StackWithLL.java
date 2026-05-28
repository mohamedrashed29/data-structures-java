package stacks;

class StackWithLL {

    public class Node {

        char data;
        Node next;

        public Node(char data) {
            this.data = data;
        }
    }
    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(char value) {
        if (isEmpty()) {
            top = new Node(value);
            return;
        }
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (isEmpty()) {
            return 0;  // the stack is empty
        }
        Node temp = top;
        top = top.next;
        return temp.data;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("the stack is empty");
            return;
        }
        System.out.println("peek data : " + top.data);
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node current = top;
        while (current != null) {

            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        StackWithLL s = new StackWithLL();

        s.push('m');
        s.push('o');
        s.push('h');
        s.push('a');
        s.push('m');
        s.push('d');

        s.display();

        s.peek();

        System.out.println("Pop = " + s.pop());

        s.display();
        System.out.println("*********************");
        String name = "mohamed";
        System.out.print(revWord("mohamed"));

    }

//Question on stacks 
/*
Describe an algorithm and write java code that uses linked lists to manipulate the stack data structure
.Using suitable java class structure, write an application program that can reverse a word using your stack functions. (10 marks)
     */
    public static String revWord(String ss) {
        String result = "";
        StackWithLL reciver = new StackWithLL();
        for (int i = 0; i < ss.length(); i++) {
            reciver.push(ss.charAt(i));
        }
        while (!reciver.isEmpty()) {
            result += reciver.pop();

        }
        return result;
    }

}
