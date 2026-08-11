class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a=arr.clone();
        Arrays.sort(a);
       HashMap<Integer,Integer> map=new HashMap<>();
       int k=1;
        for(int i:a){
            if(!map.containsKey(i)){
                map.put(i,k++);
            }
        }
        int j=0;
        for(int i=0;i<a.length;i++){
                arr[i]=map.get(arr[i]);
            
        }
        return arr;
    }
}