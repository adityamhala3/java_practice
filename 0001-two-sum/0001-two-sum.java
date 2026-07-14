class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i=1;i<nums.length;i++){
        for(int j=0;i+j<nums.length;j++){
            if(nums[i+j]+nums[j]==target){
                return new int[]{j+i,j};
            }
        }
       }
       return new int[]{};

    // int res=0;
    // for(int i=0;i<nums.length;i++){
    //     res=target-nums[i];
    //     for(int j=i+1;j<nums.length;j++){
    //     if(res==nums[j]){
    //         return new int[]{i,j};
        
    //     }
    // }
       
    // }
    //  return new int[]{};
    }
}