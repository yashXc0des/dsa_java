package questionarray;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position for non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the non-val element at the k-th position
                k++; // Move the pointer k forward
            }
        }

        return k; // k is the number of elements not equal to val
    }
}

