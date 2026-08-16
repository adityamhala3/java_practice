class Solution {
    public List<Integer> findPeaks(int[] k) {
        List<Integer> list=new ArrayList();
        for(int i=1;i<k.length-1;i++){
            if(k[i]>k[i-1] && k[i]>k[i+1]){
                list.add(i);
            }
        }
                return list;
    }
}