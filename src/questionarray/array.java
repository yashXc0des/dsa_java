package questionarray;

import java.util.ArrayList;
import java.util.Scanner;

public class array {
    // public static void main(String[] args) {
    //     int[] arr =new int[5];

    //     Scanner sc = new Scanner(System.in);

    // for(int i=0;i<5;i++){
    //     System.out.print("Enter your number at "+ i+" index");
    //     arr[i]=sc.nextInt();
    // }
    
    // for(int i=0;i<5;i++){
    //     System.out.println(" your number at "+ i+" index is "+ arr[i]);
    //     }

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr2d=new int[3][];
        // for (int i=0;i<arr2d.length ;i++){
        //     for(int j=0;j<arr2d[i].length;j++){
        //         arr2d[i][j]=sc.nextInt();
        //     }
        // }
        // for (int i=0;i<arr2d.length ;i++){
        //     for(int j=0;j<arr2d[i].length;j++){
        //         System.out.print(arr2d[i][j]);
        //     }
        //     System.out.println();
        // }
        //ArrayList<Integer> list = new ArrayList<>();
        //just ase hi ye bhi ban sktw h hm
        int[] arr ={2,3,4,5,6,7};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void reverse( int[] arr){      
        int j=arr.length-1 ;
        for(int i=0;i<arr.length/2;i++ ){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
        }
    }
}
