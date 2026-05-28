package dsa;

import java.util.Arrays;

public class noSmallerCurrentNo {
    static int[] NSCN(int[] nums){
        int[] smaller=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]<nums[i] && j!=i){
                    count++;
                }

            }
            smaller[i]=count;
        }
        return smaller;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(NSCN(new int[]{8,1,2,2,3})));
    }
}









