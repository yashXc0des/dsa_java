package questionarray;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        System.out.println(binarysearch(arr, 7));
        

    }
    static int binarysearch(int[] arr , int target){
        int start =0;
        int end = arr.length-1;
        int mid=0;
        while(start<=end){
            mid= start+(end-start)/2;
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
        return -1;

    }
    
}
