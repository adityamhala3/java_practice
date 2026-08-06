class Solution {
    public int findKthPositive(int[] arr, int k) {
       
        for(int j:arr){

            if(k>=j){
                k++;
            }else{break;}
        }return k;
    }
}