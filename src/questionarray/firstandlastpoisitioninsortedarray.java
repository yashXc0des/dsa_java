package questionarray;


public class firstandlastpoisitioninsortedarray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int[] result = firstAndLastPosition(nums, 7);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    static int[] firstAndLastPosition(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = searchPosition(arr, target, true);
        ans[1] = searchPosition(arr, target, false);
        return ans;
    }

    static int searchPosition(int[] arr, int target, boolean wantStartValue) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (wantStartValue) {
                    end = mid - 1;  // Search on the left side for the start position
                } else {
                    start = mid + 1;  // Search on the right side for the end position
                }
            }
        }
        return ans;
    }
}
