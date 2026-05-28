package stacks;

public class Stacks {

    private int top;
    private int maxSize;
    private int arr[];

    public Stacks(int ms) {
        top = -1;
        maxSize = ms;
        arr = new int[maxSize];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void push(int num) {

        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }

        arr[++top] = num;
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top--];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        int temp = top;

        while (temp >= 0) {
            System.out.print(arr[temp--] + " -> ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Stacks s = new Stacks(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        System.out.println("Peek = " + s.peek());

        System.out.println("Pop = " + s.pop());

        System.out.println("Peek = " + s.peek());

        s.display();
    }
}
