import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr2d ={{1,2,3,4},{5,6,7},{8,9}};
        System.out.println("your number is at "+ Arrays.toString(search2d(arr2d, 7)
        ));    
    }  
    static int[] search2d(int[][] arr , int target){
        int[] result =new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    } 
}
