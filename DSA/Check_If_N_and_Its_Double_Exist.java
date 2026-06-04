package dsa;

public class Check_If_N_and_Its_Double_Exist {
    static boolean Fun(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==2*arr[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={2,5,7,10};
        System.out.println(Fun(arr));
    }
}
