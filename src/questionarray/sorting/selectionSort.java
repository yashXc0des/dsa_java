package questionarray.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void selectionSort(int[] arr){

        
        for (int i =0;i<arr.length;i++){
            int maxIndex=0;
            for(int j =0;j<arr.length-i;j++){
                if(arr[j]<arr[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

    }
    
}
