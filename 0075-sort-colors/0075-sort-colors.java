class Solution {
    public void sortColors(int[] nums) {
    //   int low=0;
    //   int mid=0;
    //   int high=nums.length-1;
    //   while(mid<=high){
    //     if(nums[mid]==0){
    //         int temp=nums[mid];
    //         nums[mid]=nums[low];
    //         nums[low]=temp;
    //         low++;
    //         mid++;
    //     }
    //     else if(nums[mid]==1){
    //         mid++;
    //     }
    //     else{
    //        int temp=nums[mid];
    //        nums[mid]=nums[high];
    //        nums[high]=temp;
         
    //        high--;
    //     }
    //   }
    for(int i=0;i<nums.length;i++){
        for(int j=1;j<nums.length-i;j++){
            if(nums[j]<nums[j-1]){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
            }
        }
    }
    
    }
}