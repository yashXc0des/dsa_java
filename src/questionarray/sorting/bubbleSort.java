package questionarray.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    flag++;
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                if(flag==0){
                    break;
                }
            }
        }
    }
    
}
