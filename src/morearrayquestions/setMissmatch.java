package morearrayquestions;

import java.util.Arrays;

public class setMissmatch {
    public static void Cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp = arr[correctIndex];
                arr[correctIndex]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
    }
    public static int[] findErrorNums(int[] nums) {
        Cyclicsort(nums);
        int[] a = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                a[0]=i;
                a[1]=i+1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[] a =new int[2];
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    
}
