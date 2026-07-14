class Solution {
    public boolean containsDuplicate(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)>1){
                return true;
            }
        }
        return false;
        
    }
}