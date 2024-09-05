package morearrayquestions;

import java.util.ArrayList;
import java.util.List;

public class findingallmisiiingvalues {
        public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> ans= new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
        
        
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correectindex = arr[i]-1;
            if(arr[i]!=arr[correectindex]){
                int temp=arr[correectindex];
                arr[correectindex]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;

            }
        }
    }
    
}
