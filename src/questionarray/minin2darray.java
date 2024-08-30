package questionarray;
public class minin2darray {
    public static void main(String[] args) {
        int[][] array2d ={{8,3,4,4},{12,123,3,423},{32,4,3}};
        System.out.println(minin2darray(array2d));

    }
    static int minin2darray(int[][] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;   
    }
    
}
