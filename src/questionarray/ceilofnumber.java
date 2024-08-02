package questionarray;

public class ceilofnumber {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,12,15};
        System.out.println(cealingnumber(arr, 8));
    
    }
    static int cealingnumber(int[] arr, int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end= mid-1;
            }
            else{
                return mid;
            }
        }
        return arr[end];

    }
    
}
