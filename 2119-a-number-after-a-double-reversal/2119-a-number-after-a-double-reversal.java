class Solution {
    public boolean isSameAfterReversals(int num) {
        int k=reverse(num);
        int g=reverse(k);

        return g==num;


    }public int reverse(int x) {
      
        int result=0;
        while(x!=0){
            
            if(result > Integer.MAX_VALUE/10 ||
            result<Integer.MIN_VALUE/10){
                return 0;
            }
            result=result*10 +x%10;
            x/=10;
        }
        return result;
    }
}