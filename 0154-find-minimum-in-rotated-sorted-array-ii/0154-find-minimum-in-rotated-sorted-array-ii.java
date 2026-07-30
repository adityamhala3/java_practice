class Solution {
    public int findMin(int[] nums) {
        int s=nums[0];
        for(int i:nums){
            if(s>i){
                s=i;
            }
        }
        return s;
    }
}