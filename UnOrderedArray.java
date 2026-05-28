package Arrays;

public class UnOrderedArray {

    private int arr[];
    private int count;

    public UnOrderedArray(int size) {

        arr = new int[size];
        count = 0;

    }

    // Find value and return index
    public int find(int value) {

        for (int i = 0; i < count; i++) {

            if (value == arr[i]) {
                return i;
            }

        }

        return -1;

    }

    // Insert at end
    public void insert(int value) {

        if (count == arr.length) {

            System.out.println("Array is full");
            return;

        }

        arr[count++] = value;

    }

    // Delete by value
    public void delete(int value) {

        if (count == 0) {

            System.out.println("Array is empty");
            return;

        }

        int index = find(value);

        if (index == -1) {

            System.out.println("Value not found");
            return;

        }

        for (int i = index; i < count - 1; i++) {

            arr[i] = arr[i + 1];

        }

        count--;

    }

    // Delete by index
    public void deleteByIndex(int index) {

        if (count == 0) {

            System.out.println("Array is empty");
            return;

        }

        if (index < 0 || index >= count) {

            System.out.println("Invalid index");
            return;

        }

        for (int i = index; i < count - 1; i++) {

            arr[i] = arr[i + 1];

        }

        count--;

    }

    // Insert at specific index
    public void insertByIndex(int index, int value) {

        if (count == arr.length) {

            System.out.println("Array is full");
            return;

        }

        if (index < 0 || index > count) {

            System.out.println("Invalid index");
            return;

        }

        for (int i = count; i > index; i--) {

            arr[i] = arr[i - 1];

        }

        arr[index] = value;

        count++;

    }

    // Display array
    public void display() {

        System.out.print("Array [ ");

        for (int i = 0; i < count; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println("]");

    }

    public static void main(String[] args) {

        UnOrderedArray arr = new UnOrderedArray(5);

        // Insert
        arr.insert(12);
        arr.insert(30);
        arr.insert(26);

        System.out.println("After Insert:");
        arr.display();

        // Insert By Index
        arr.insertByIndex(1, 15);

        System.out.println("After Insert By Index:");
        arr.display();

        // Find
        System.out.println("Index of 30 : " + arr.find(30));

        // Delete By Value
        arr.delete(30);

        System.out.println("After Delete Value:");
        arr.display();

        // Delete By Index
        arr.deleteByIndex(1);

        System.out.println("After DeleteByIndex:");
        arr.display();
    }
}
