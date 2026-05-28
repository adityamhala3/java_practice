package dsa;

public class riche_cus {
    static int max_wealth(int[][] accounts){
        int wealth=0;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum=sum+accounts[i][j];
            }
            if(sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
    }

    public static void main(String[] args) {
        int[][] acc={{1,2,3},{3,2,1}};
        System.out.println(max_wealth(acc));
    }
}
