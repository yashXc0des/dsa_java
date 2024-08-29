package questionarray;

public class mountain {
    public static void main(String[] args) {
        int[] arr ={0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
        
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int mid = start +(end-start)/2;
        while(start<end){
             mid = start +(end-start)/2;

            if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid;
            }

        }
        return start;
        
    }
    
}
