package questionarray.leetcodedailyquestions;

import java.util.Arrays;

public class largestnumber {
    public static String largestNumber(int[] nums) {
        selectionsort(nums);
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<nums.length;i++){
            ans.append(nums[i]);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        int[] arr= {3,30,34,5,9};
        System.out.println(largestNumber(arr));

    }
    public static void selectionsort(int[] arr){
        for(int i =0;i<=arr.length-2;i++){  
            int max =arr[i];
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]>arr[i]){
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                }
            }
        }
    }
}
