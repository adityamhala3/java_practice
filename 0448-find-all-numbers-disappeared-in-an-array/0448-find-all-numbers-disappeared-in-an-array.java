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


        HashSet<Integer> map=new HashSet<>();    
        for(int i:nums){          
            map.add(i);          
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.contains(i)){
                list.add(i);}
        }
        return list;
    }
}