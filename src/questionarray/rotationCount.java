package questionarray;

public class rotationCount {
    public static void main(String[] args) {
        int[] arr= {12,30,40,2,3,4,6,8,9};
        //System.out.println(findPivot(arr));
        System.out.println(countOfRotation(arr));
        
    }
    public static int findPivot(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]&& mid<end){
                return mid;
            }
            if(arr[mid-1]>arr[mid]&& mid-1>start){
                return mid-1;
            }
            if(arr[start]<arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static int countOfRotation(int[] arr) {
        int a= findPivot(arr);
        return binarySearch(arr, a)-1;

    }
    public static int binarySearch(int[] arr, int target){
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            return mid;
        }
        return -1;
    }
    
}
