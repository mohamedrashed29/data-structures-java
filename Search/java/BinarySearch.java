package Search.java;

public class BinarySearch {

    // Iterative Binary Search
    // Time Complexity: O(log n)
    public static int binarySearch(int[] arr, int num) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (num == arr[mid]) {
                return mid;
            }

            if (num > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    // Recursive Binary Search
    // Time Complexity: O(log n)
    public static int recursiveBinarySearch(int[] arr, int key, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {

            return mid;

        } else if (key < arr[mid]) {

            return recursiveBinarySearch(arr, key, low, mid - 1);

        } else {

            return recursiveBinarySearch(arr, key, mid + 1, high);

        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 9};

        // Recursive Binary Search
        System.out.println("Recursive Binary Search:");

        int recursiveResult
                = recursiveBinarySearch(arr, 7, 0, arr.length - 1);

        if (recursiveResult != -1) {

            System.out.println("Found at index: " + recursiveResult);

        } else {

            System.out.println("Not Found");

        }

        // Iterative Binary Search
        System.out.println("\nBinary Search:");

        int binaryResult = binarySearch(arr, 5);

        if (binaryResult != -1) {

            System.out.println("Found at index: " + binaryResult);

        } else {

            System.out.println("Not Found");

        }
    }
}
