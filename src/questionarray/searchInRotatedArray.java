package questionarray;

public class searchInRotatedArray {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {  // The array is not rotated
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If the target is found at the pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target is in the left sorted part
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // If target is in the right sorted part
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  // Pivot not found, the array is not rotated........
        
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));  // Output: 4
        System.out.println(search(nums, 3));  // Output: -1
    }
}
