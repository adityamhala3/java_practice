class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] arr=new int[n][n];
        // for(int i=0;i<image.length;i++){
        //     for(int j=0;j<image.length;j++){
        //         if(image[i][j]==0){
        //             arr[i][n-j-1]=1;
        //         }else{
        //             arr[i][n-j-1]=0;;
        //         }
        //     }
        // }return arr;

        for(int i=0;i<n;i++){
            int k=0;
            for(int j=n-1;j>=0;j--){
                 if(image[i][j]==0){
                    arr[i][k++]=1;
                }else{
                    arr[i][k++]=0;
                }
            }
            }
        return arr;
    }
}