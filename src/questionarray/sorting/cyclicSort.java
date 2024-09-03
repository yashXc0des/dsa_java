package questionarray.sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr={6,5,4,2,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correectindex = arr[i]-1;
            if(arr[correectindex]==arr[i]){
                i++;
            }
            else{
                int temp=arr[correectindex];
                arr[correectindex]=arr[i];
                arr[i]=temp;
            }
        }
    }
    
}
