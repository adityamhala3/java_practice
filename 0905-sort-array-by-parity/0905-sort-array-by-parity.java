class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] a=new int[nums.length];
      int s=0;
      int e=nums.length-1;
     for(int i:nums){
        if(i%2==0){
            a[s]=i;
            s++;
        }else{
            a[e]=i;
            e--;
        }
      }return a;
    }
}