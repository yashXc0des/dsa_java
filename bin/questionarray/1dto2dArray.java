public class 1dto2dArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){
            return {{}};
        }
        int a = original.length-1;       
        int[][] result = new int[][];
        for(int i =0; i<a;i++){
            int row= i/2;
            int column = i%2;
            result[row][column]=original[i];

        }
        return result;
    }
      
    
}
