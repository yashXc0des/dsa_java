package questionarray;

public class findinMOuntainarray {
    static int binarysearch(int[] arr , int target,int start, int end){
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
    public static void main(String[] args) {
        int[ ] arr = {1,2,3,4,5,3,1,0};
        int s = peakIndexInMountainArray( arr);
        int a =binarysearch(arr,0 ,0,s);
        int b =0;
        if(a==-1){
            b = binarysearch(arr, 5, s, arr.length);
            a=b;
        }
        System.out.println(a);
        
        


    }
    
}
