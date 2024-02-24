package wang.lidong.leetcode;

/**
 * @Author:lidongw_1
 * @Date 2022/4/28
 * @Description: TODO
 **/
public class RotateMatrixLCCIdemo {

    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {

        int[][] result = new int[matrix[0].length][matrix.length];

        for(int i=0 ; i < matrix.length ; i++){
            for(int x = 0 ; x < matrix[0].length ; x++){
                result[x][matrix[0].length-i-1] = matrix[i][x];
            }
        }
        for(int i=0 ; i < matrix.length ; i++){
            for(int x = 0 ; x < matrix[0].length ; x++){
                matrix[i][x] = result[i][x];
            }
        }
    }
}
