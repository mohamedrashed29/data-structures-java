package sorting;

import java.util.Arrays;

public class SimpleSorting {

    // Bubble Sort 
    // Time Complexity: O(n²)
    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    // Insertion Sort
    // Time Complexity: O(n²)
    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = temp;
        }
    }

    // Selection Sort
    // Time Complexity: O(n²)
    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    public static void main(String[] args) {

        int arr1[] = {5, 2, 3, 6, 4, 7};
        int arr2[] = {5, 2, 3, 6, 4, 7};
        int arr3[] = {5, 2, 3, 6, 4, 7};

        // Bubble Sort Test
        bubbleSort(arr1);
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(arr1));

        // Insertion Sort Test
        insertionSort(arr2);
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(arr2));

        // Selection Sort Test
        selectionSort(arr3);
        System.out.println("Selection Sort:");
        System.out.println(Arrays.toString(arr3));
    }
}