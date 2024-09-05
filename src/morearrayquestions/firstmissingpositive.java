package morearrayquestions;

import java.util.Arrays;

public class firstmissingpositive {
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]>0&& arr[i]<arr.){
                int correectindex = arr[i]-1;
                if(arr[i]!=arr[correectindex]){
                    int temp=arr[correectindex];
                    arr[correectindex]=arr[i];
                    arr[i]=temp;
                }
                else{
                    i++;
    
                }
            }else{i++;}

        } 
    }
    public static int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        for(int i=0;i<nums.length;i++){
                if(nums[i]!=i+1){
                   return i+1;
                }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] arr={7,8,9,11,12};
        // cyclicSort(arr);
        // System.out.println(Arrays.toString(arr));
        int a = firstMissingPositive(arr);
        System.out.println(a);
    }
    
}
