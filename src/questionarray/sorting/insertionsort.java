package questionarray.sorting;

import java.util.Arrays;

public class insertionsort {
    public static void insertionSort(int[] arr){
        for(int i =0;i<=arr.length-2;i++){

            for(int j =i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else{
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3, -1, 7, -5, 2, -8, 4, -2, 10, -6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
