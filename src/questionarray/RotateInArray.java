package questionarray;

public class RotateInArray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        int [] s= Rotate(arr,3);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
        
    }
    public static int [] Rotate(int[] arr, int r){
        int a = r;
        while (a!=0){
            int temp = arr[arr.length-1];
            for(int i=arr.length-1 ; i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            a--;
        }
        return arr;
    }
    
}
