class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=1;
        Arrays.sort(nums);
        for(int j=0;j<nums.length;j++){
            if(i==nums[j]){
                i++;
            }
        }
        return i;
    }
}