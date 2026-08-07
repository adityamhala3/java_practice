class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int sum=n*(n+1)/2;
        // int s=0;
        // for(int i:nums){
        //     s+=i;
        // }
        // return sum-s;


        int i=0;

        while(i<nums.length){
            int c=nums[i];
            if( nums[i]<nums.length && nums[i]!=nums[c]){
                int temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
            }else {i++;}
        }for(int j=0;j<nums.length;j++){
            if(j!=nums[j]){
                return j;
            }
        }
        return nums.length;
    }
}