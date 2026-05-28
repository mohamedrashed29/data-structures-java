package Search.java;

public class LinearSearch {

    // Linear LinearSearch
    // Time Complexity: O(n)
    public static boolean linearSearch(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 9};

        // Linear LinearSearch Test
        System.out.println("Linear Search:");

        if (linearSearch(arr, 7)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
