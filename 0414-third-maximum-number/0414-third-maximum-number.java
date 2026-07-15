class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
       int j=nums[nums.length-1];

       int c=1;
       for(int i=nums.length-2;i>=0;i--){
        if(nums[i]!=j){
            c++;
            j=nums[i];
        }
        if(c==3){
            return nums[i];
        }
       }
       
       return nums[nums.length-1];
    }
}