class Solution {
    public int specialArray(int[] nums) {
      
        int x=nums.length;
        for(int i=0;i<=x;i++){
              int count=0;
              for(int num:nums){
                if(num>=i){
                    count++;
                }
              }
              if(count==i){
                return i;
              }
        } 

        return -1;

    }
    

}
