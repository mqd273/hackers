package wang.lidong.leetcode;

/**
 * @Author:lidongw_1
 * @Date 2020/7/6
 * @Description: 不同路径 II
 **/
public class UniquePathsII {


    public static void main(String[] args) {
        Solution solution = new Solution();


     //   int[][] ss = new int[][] {{0,1,0},{0,1,0},{0,1,0}};

     //   int[][] ss = new int[][] {{1}};

        int[][] ss = new int[][] {{0,0}};

        int i = solution.uniquePathsWithObstacles(ss);

        System.out.println(i);
    }
}




class Solution  {

    public int num = 0 ;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid[0][0] == 1)
            return 0;

        uniquePaths(obstacleGrid,0,0);
        return num;
    }


    /**
     * 递归实现， leetcode 超时了
     * @param obstacleGrid
     * @param x
     * @param y
     */
    void  uniquePaths(int[][] obstacleGrid ,int x,int y){

        if (x + 1 <obstacleGrid.length  && obstacleGrid[x+1][y] != 1){
            uniquePaths(obstacleGrid ,x+1,y);
        }

        if (y + 1 < obstacleGrid[0].length && obstacleGrid[x][y+1] != 1){
            uniquePaths(obstacleGrid ,x,y+1);
        }

        //在
        if (x+1 == obstacleGrid.length && y+1 ==  obstacleGrid[0].length && obstacleGrid[x][y] != 1){
            //正确路径 + 1
                num++;
        }
    }


    /**
     * 动态规划做法
     * @param obstacleGrid
     */
    void uniquePathsV2(int[][] obstacleGrid){

        int y = obstacleGrid.length;
        int x = obstacleGrid[0].length;

        int[][] clone = new int[y][x];

        for (int i = 0; i < x; i++) {
            if (obstacleGrid[0][i]==0) {
                clone[0][i] = 1;
            }else {
                clone[0][i] = 0;
            }
        }

    }
}