class Solution {
    public int majorityElement(int[] nums) {
       LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
       for(int i:nums){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }else{
            map.put(i,1);
        }
       }
       int t=0;
       for(int i:map.keySet()){
            if(map.get(i)>nums.length/2){
                
                 t=i;
                 return i;
            }
        } 
            return t;
    }
}