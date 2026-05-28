package Arrays;

public class DynamicArray {

    // Attributes
    private int[] items;
    private int count;

    // Constructor
    public DynamicArray(int size) {
        items = new int[size];
        count = 0;
    }

    // Get Number Of Elements
    public int getCount() {
        return count;
    }

    // Check If Array Is Full
    public boolean isFull() {
        return count == items.length;
    }

    // Insert At End
    public void insert(int item) {

        if (isFull()) {
            System.out.println("Array is full");
            return;
        }

        items[count] = item;
        count++;
    }

    // Insert At Specific Index
    public void insert(int index, int item) {

        // Check if array is full
        if (isFull()) {
            System.out.println("Array is full");
            return;
        }

        // Check if index is valid
        if (index < 0 || index > count) {
            System.out.println("Invalid index");
            return;
        }

        // Shift elements to the right
        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }

        // Insert new item
        items[index] = item;
        count++;
    }

    // Search For Element
    public boolean search(int item) {

        for (int i = 0; i < count; i++) {

            if (items[i] == item) {
                return true;
            }

        }

        return false;
    }

    // Delete By Index
    public void delete(int index) {

        // Check valid index
        if (index < 0 || index >= count) {
            System.out.println("Invalid index");
            return;
        }

        // Shift elements to the left
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    // Enlarge Array
    public void enlarge(int newSize) {

        if (newSize <= items.length) {
            System.out.println("New size must be larger");
            return;
        }

        int[] newItems = new int[newSize];

        // Copy old elements
        for (int i = 0; i < count; i++) {
            newItems[i] = items[i];
        }

        items = newItems;

        System.out.println("Array enlarged successfully");
    }

    // =========================
    // Display Array
    // =========================
    public void display() {

        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }

        System.out.println();
    }

    // =========================
    // Main Method
    // =========================
    public static void main(String[] args) {

        DynamicArray arr = new DynamicArray(5);

        // Insert elements
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);

        System.out.println("Original Array:");
        arr.display();

        // Insert at index
        arr.insert(2, 25);

        System.out.println("After inserting 25 at index 2:");
        arr.display();

        // Search
        System.out.println("Search for 20:");
        System.out.println(arr.search(20));

        // Delete
        arr.delete(1);

        System.out.println("After deleting index 1:");
        arr.display();

        // Enlarge array
        arr.enlarge(10);

        // Insert after enlarge
        arr.insert(50);
        arr.insert(60);

        System.out.println("Final Array:");
        arr.display();

        // Print number of elements
        System.out.println("Number of elements:");
        System.out.println(arr.getCount());
    }
}
