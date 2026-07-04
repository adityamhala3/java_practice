class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      ArrayList<Integer> list=new ArrayList<>();
      for(int j=0;j<nums.length;j++){
        list.add(index[j],nums[j]);
      }
      int[] target=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        target[i]=list.get(i);
      }  
      return target;



   
    }
}