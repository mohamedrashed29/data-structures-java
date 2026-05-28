package Arrays;

public class OrderedArray {

    private int[] arr;
    private int count;

    public OrderedArray(int size) {

        arr = new int[size];
        count = 0;

    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == arr.length;
    }

    public int find(int value) {

        int low = 0;
        int high = count - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (value == arr[mid]) {

                return mid;

            } else if (value < arr[mid]) {

                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return -1;

    }

    public void insert(int value) {

        if (isFull()) {

            System.out.println("Array is full");
            return;

        }

        int i;

        for (i = count - 1; i >= 0 && arr[i] > value; i--) {

            arr[i + 1] = arr[i];

        }

        arr[i + 1] = value;

        count++;

    }

    public void delete(int value) {

        if (isEmpty()) {

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

    public void display() {

        System.out.print("Array [ ");

        for (int i = 0; i < count; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println("]");

    }

    public static void main(String[] args) {

        OrderedArray o = new OrderedArray(10);

        o.insert(50);
        o.insert(20);
        o.insert(40);
        o.insert(10);
        o.insert(30);

        System.out.println("Ordered Array:");

        o.display();

        System.out.println("Index of 40: " + o.find(40));

        System.out.println("Index of 100: " + o.find(100));

        o.delete(20);

        System.out.println("After Delete:");

        o.display();

    }
}