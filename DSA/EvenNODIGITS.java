package dsa;

public class EvenNODIGITS {
    static int FNEND(int[] nums){
        int count=0;
        for (int i:nums){
            if((i>=10 && i<100) || (i>=1000 && i<10000) || (i==100000)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(FNEND(new int[]{12,345,2,6,7896}));
    }
}
