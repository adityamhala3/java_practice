class Solution {
    public int findDuplicate(int[] nums) {
        //..brute force

    //   HashSet<Integer> set=new HashSet<>();
    //   int k=0;
    //   for(int i:nums){
    //     boolean b=set.add(i);
    //     if(!b){
    //         k=i;
    //     }
    //   }
    //   return k;

//--------------------------------------------------------------------
            int i=0;
            while(i<nums.length){
                int c=nums[i]-1;
                if(nums[i]!=nums[c]){
                    int temp=nums[i];
                    nums[i]=nums[c];
                    nums[c]=temp;
                }else{
                    i++;
                }
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1){
                    return nums[j];
                }
            }


            return i;

    }
}