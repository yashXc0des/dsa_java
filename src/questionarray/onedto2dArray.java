package questionarray;

public class onedto2dArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[][] towDarray = construct2DArray(arr, 3, 2);
        int m =3;        int n =2;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(towDarray[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if(m*n!=original.length){
            return result ;
        }
        int a = original.length;       
        for(int i =0; i<a;i++){
            int row= i/2;
            int column = i%2;
            result[row][column]=original[i];

        }
        return result;
    }

    
}
