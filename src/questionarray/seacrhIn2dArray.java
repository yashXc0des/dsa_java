// package questionarray;

// public class seacrhIn2dArray {
//     public static void main(String[] args) {
//         int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,6}};
//          boolean result = binarySearchIn2dArray(arr, 13);
//         System.out.println(result);
//     }

//     public static boolean binarySearchIn2dArray(int[][] arr, int target) {
//         int row = Floorofnumber(arr, target);
//         int[] result = {row, -1}; // Initialize column index to -1

//         if (row == -1) {
//             return false; // Target is not in any row
//         }

//         int start = 0;
//         int end = arr[row].length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (target > arr[row][mid]) {
//                 start = mid + 1;
//             } else if (target < arr[row][mid]) {
//                 end = mid - 1;
//             } else {
//                 result[1] = mid; // Found the target
//                 return true;
//             }
//         }

//         return false; // Target not found in the row
//     }

//     public static int Floorofnumber(int[][] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;
//         int mid;

//         while (start <= end) {
//             mid = start + (end - start) / 2;

//             if (target >= arr[mid][0] && target <= arr[mid][arr[mid].length - 1]) {
//                 return mid; // Target is within the range of this row
//             } else if (target < arr[mid][0]) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }

//         return -1; // Target is not in any row
//     }
// }
package questionarray;
class seacrhIn2dArray{
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean result = binarySearchIn2dArray(matrix,target);
        return result;
        
    }
        public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,6}};
        System.out.println(searchMatrix(arr, 13));
    }
        public static boolean binarySearchIn2dArray(int[][] arr, int target) {
        int row = Floorofnumber(arr, target);
        int[] result = {row, -1}; // Initialize column index to -1

        if (row == -1) {
            return false; // Target is not in any row
        }

        int start = 0;
        int end = arr[row].length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[row][mid]) {
                start = mid + 1;
            } else if (target < arr[row][mid]) {
                end = mid - 1;
            } else {
                result[1] = mid; // Found the target
                return true;
            }
        }

        return false; // Target not found in the row
    }
        public static int Floorofnumber(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target >= arr[mid][0] && target <= arr[mid][arr[mid].length - 1]) {
                return mid; // Target is within the range of this row
            } else if (target < arr[mid][0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; // Target is not in any row
    }
}
