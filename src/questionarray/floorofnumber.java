package questionarray;

public class floorofnumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,9,14,16,18};
        System.out.println(binarysearch(arr, 15));
        

    }
    static int binarysearch(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return arr[end];

    }
    
}
