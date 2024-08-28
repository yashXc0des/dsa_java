package questionarray;

public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16};
        int target = 4;
        int result = ans(arr, target);
        System.out.println("Index of target: " + result);  // Should output 2, since arr[2] = 4
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the range until the target is within it
        while (arr[end] < target) {
            start = end + 1;
            end = end * 2;
        }

        // Perform binary search within the identified range
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
