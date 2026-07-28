class Solution {
    public int maxProduct(int n) {
       int m=0;
       int k=0;
       int rev=0;
       while(n!=0){
        rev=n%10;
        if(rev>m){
            k=m;
            m=rev;

        }else if(rev>k){
            k=rev;
        }
        n/=10;
       }return m*k;
    }
}