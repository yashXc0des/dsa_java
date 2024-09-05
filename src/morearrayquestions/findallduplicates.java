package morearrayquestions;
import java.util.*;

public class findallduplicates {
    
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        
        // Cyclic sort to place each number in its correct position
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            // If the current element is not at its correct position and it's not equal to the correct index element, swap
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        
        // After sorting, find all numbers which are not in their correct positions
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }
        
        return ans;
    }
}
