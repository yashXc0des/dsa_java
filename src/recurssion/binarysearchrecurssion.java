package recurssion;

public class binarysearchrecurssion {
    static int search(int[] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if (arr[mid]==target) {
            return mid;
        }
        if (target>arr[mid]) {
            return search(arr, target, mid+1, end);
        }
        else{
            return search(arr, target, start, mid-1);
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,6,8,10,12};
        System.out.println(search(arr, 4, 0, arr.length-1));
    }
    
}
