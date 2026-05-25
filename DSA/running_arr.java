package dsa;

import java.util.Arrays;

class running_arr {

        static int[] runningSum(int[] nums) {
            for(int i=1; i<nums.length;i++){
                nums[i]=nums[i-1]+nums[i];
            }
            return nums;
        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(runningSum(new int[]{1,2,4,5,6})));
        }
    }

