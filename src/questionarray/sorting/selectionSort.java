package questionarray.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void selectionSort(int[] arr){
        int end = arr.length-1;
        for(int i=0;i<arr.length;i++){

            int max = arr[i];
            for(int j =1;j<arr.length;j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            arr[end]=max;
            end--;
        }
    }
    
}
