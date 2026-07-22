class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
    //     int[] d=new int[nums.length];
    //    int j=0;
    //     for(int i=nums.length-1;i>=0;i--){
    //         d[j++]=nums[i];
    //     }
            return nums[nums.length-k];
    }
}