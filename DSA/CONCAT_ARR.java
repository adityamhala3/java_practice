package dsa;

import java.util.Arrays;

class CONCAT_ARR{



    static int[] getcon(int[] nums){
        int n= nums.length;
        int[] ans=new int[2*n];
        for (int i = 0; i <n ; i++) {

            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getcon(new int[] {1,2,34,56})));
    }
}


