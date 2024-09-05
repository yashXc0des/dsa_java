package questionarray;

public class missingnumbers {
    public static int minnum(int[] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[correctIndex]!=arr[i]){
                int temp= arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            if(arr[i]==i+1){
                i++;
            }
            else if(arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
    public static void cyclicsort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[correctIndex]!=arr[i]){
                int temp= arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else if(arr[i]==i+1){
                i++;
            }
            else if(arr[i]==i+1){

            }
        }
    }
    
}
