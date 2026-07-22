class Solution {
    public int findDuplicate(int[] nums) {
      HashSet<Integer> set=new HashSet<>();
      int k=0;
      for(int i:nums){
        boolean b=set.add(i);
        if(!b){
            k=i;
        }
      }
      return k;
    }
}