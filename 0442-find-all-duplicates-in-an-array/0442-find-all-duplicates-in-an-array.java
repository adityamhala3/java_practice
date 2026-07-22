class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums){
            boolean b=set.add(i);
            if(!b){
                list.add(i);
            }
        }
        return list;
    }
}