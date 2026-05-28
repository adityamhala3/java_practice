package dsa;

public class no_goodpairs {
    static int nIP(int[] nums){

        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println( nIP(new int[] {1,2,3,1,1,3}));
    }
}
