class Solution {
    public int search(int[] nums, int target) {
    //  int s = 0; 
    //      int e = nums.length - 1;
    //   while(s<=e){
    
    //     int mid = s + (e - s)/2;     
    //      if(nums[mid] > nums[mid+1]){
    //        return (BinarySearch(nums,target));
    //      }
         
        
    //   }
    //   return -1;

    // }
    
    //     private int BinarySearch(int[] nums, int target){
    //         int s = 0; 
    //         int e = nums.length - 1;
    //         while(s <= e){
    //             int mid = s + (e - s)/2;
    //             if(target > nums[mid]){
    //                 s = mid + 1;
    //             }
    //            else if(target < nums[mid]){
    //                 e = mid ;
    //             }
    //             else{
    //                 return mid;
    //             }
    //         }
    //         return -1;


    
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;
        }
    }return -1;
        }
}