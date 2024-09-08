import java.util.Arrays;

public class sorting {

    // Swap function to swap two elements in an array
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Insertion Sort implementation
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j); // Correct swap logic with array and indices
                } else {
                    break;
                }
            }
        }
    }

    // Cyclic Sort implementation
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Find the correct index for arr[i]
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex); // Swap to place the element in the correct position
            } else {
                i++;
            }
        }
    }
    // bubble sort i

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        cyclicSort(a);

        System.out.println(Arrays.toString(a)); // Should output [1, 2, 3, 4, 5]
    }
}
