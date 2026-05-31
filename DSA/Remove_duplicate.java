package dsa;

public class Remove_duplicate {
    static int RDFSA(int[] nums){
        int i=0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i]!=0){
                i++;
                nums[i]=nums[j];
            }

        }
        return i+1;
    }

    public static void main(String[] args) {
        System.out.println(RDFSA(new int[]{1,2,2}));
    }
}
