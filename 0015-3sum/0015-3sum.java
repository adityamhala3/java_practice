class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length;k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
        int i=k+1;
        int j=nums.length-1;
        while(i<j && k<nums.length-1){
            if(nums[i]+nums[j]==-nums[k]){
                list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                i++;
                j--;

            while (i < j && nums[i] == nums[i - 1]) i++;
            while (i < j && nums[j] == nums[j + 1]) j--;
            }else if(nums[i]+nums[j]>-nums[k]){
                j--;
                
            }else{
                i++;
            }
        }}return list;
    }
}