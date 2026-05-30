package dsa;

public class houseRObber {
    static int rob(int[] nums){
        int house1=0;
        int house2=0;
        for (int i = 0; i < nums.length; i++) {
            int temp=Math.max(house1,house2 + nums[i]);
            house2=house1;
            house1=temp;
        }
        return house1;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,1}));
    }
}
