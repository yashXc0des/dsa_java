package questionarray;

public class infinitearray {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,6,7,8,9,12,13,14,15,16};
        ans(arr, 4);
        
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end =1;
        int answer=binarysearch(arr, target, start, end);
        if(arr[answer]==target){
            return answer;
        }
        return -1;
    }
    
    static int binarysearch(int[] arr , int target,int start,int end){

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
