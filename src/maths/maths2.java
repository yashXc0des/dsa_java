package maths;

public class maths2 {
    
    public static double  squareRootusingBinarySearch(int n,int p){
        int start=0;
        int end =n;
        double root=0.0;
        while(end>=start){
            int mid = start+(end-start)/2;
            if(mid*mid==n){
            return mid;
            }
            if(mid*mid>n){
                end=mid-1;
            }
            else if (mid*mid<n){
                start=mid+1;
            }
        }
        double inc =0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }
    public static int sqrt(int n){
        int start =0;
        int end = n;
        while (start<=end){
            int mid = start+(end - start)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
      System.out.println(  squareRootusingBinarySearch(40,3));
      System.out.println(sqrt(40));
    }
}
