class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        // LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();    
        // for(int i:nums){          
        //     map.put(i,1);          
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(!map.containsKey(i)){
        //         list.add(i);}
        // }
        // return list;
//------------------------------------------------------------------------
        //2nd soln
        // HashSet<Integer> map=new HashSet<>();    
        // for(int i:nums){          
        //     map.add(i);          
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(!map.contains(i)){
        //         list.add(i);}
        // }
        // return list;

  //---------------------------------------------------------------------

  int i=0;
  while(i<nums.length){
    int c=nums[i]-1;
    if(nums[i]!=nums[c]){
        int temp=nums[i];
        nums[i]=nums[c];
        nums[c]=temp;
    }else{i++;}
  }
  for(int j=0;j<nums.length;j++){
    if(nums[j]!=j+1){
        list.add(j+1);
    }
  }
return list;
    }
}