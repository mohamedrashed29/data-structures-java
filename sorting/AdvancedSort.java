package sorting;

public class AdvancedSort {

    // Quick Sort
    // Time Complexity : o(n log(n))
    public static void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return; // base case
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int j = start - 1;

        for (int i = start; i < end; i++) {
            if (pivot > arr[i]) {
                j++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;

        int temp = arr[j];
        arr[j] = pivot;
        arr[end] = temp;

        return j;
    }

    // shell sort
    // Time Complexity : o(n log(n))
    public static void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }

    public void mergeSort(int[] arr){
        if(arr.length == 1) return;
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i <arr.length ; i++) {
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr , left , right);
    }
    
    private void merge(int[] arr, int[] left, int[] right) {
        int a = 0 , l = 0 , r = 0 ;
        
        while(l < left.length && r < right.length){
            if(left[l] > right[r])
                arr[a++] = right[r++];
            else
                arr[a++] = left[l++];
        }
        while(l < left.length){
            arr[a++] = left[l++];
        }
        while(r < right.length){
            arr[a++] = right[r++];
        }
    }
    
    

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 65, 74, 6, 1, 2, 84, 21, 5};
        shellSort(arr);
//
//        for (int x : arr)
//            System.out.print(x + " ");
        System.out.println("");
//        quickSort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    

}
