class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int ans=0;
        if(n>=1000){
            ans+=(long)n-1000+1;
        }
        
        if(n>=100000){
            ans+=(long)n-100000+1;
        }
        if(n==100000){
            return 99001;
        }
        
       
        return ans;
    }
}