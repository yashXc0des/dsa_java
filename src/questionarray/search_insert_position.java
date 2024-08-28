package questionarray;

public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end = nums.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target>mid){
               start=mid+1;
            }
            else if(target<mid){
                end =mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
        
    }
    
}
