package dsa;

import java.util.Arrays;

public class trans_matrix {
    static int[][] TM(int[][] matrix){
        int[][] trans=new int[matrix[0].length][matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                trans[j][i]=matrix[i][j];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.toString(TM(matrix)));
    }
}
