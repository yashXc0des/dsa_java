package questionarray.sorting;

import java.util.Arrays;

public class bubblesoert {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int [] arr){
        for(int i =0 ; i<arr.length;i++){
            for(int j =1;j<arr.length-i;j++){
                if(arr[j-1]<arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    
}
