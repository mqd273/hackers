package wang.lidong.io;

/**
 * @Author:lidongw_1
 * @Date 2022/4/27
 * @Description: TODO
 **/
public class EachTwoArray {

    public static void main(String[] args) {

       // int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       // System.out.println(arr[1][0]);
        each(arr);

    }

    private static void each(int[][] arr){
        //传递的都是下标
        eachX(arr,0,0,arr.length-1,arr[0].length-1,true);

    }

    /**
     * 处理横向
     * @param arr
     * @param sx
     * @param sy
     * @param mx
     * @param my
     * @param asc
     *
     * ----->
     * <---------
     */
    private static void eachX(int[][] arr,int sx,int sy,int mx,int my,boolean asc){

        if (sx ==mx && sy==my){
            System.out.println(arr[sx][sy]);
            return;
        }

        if (sx>mx && sy>my){
            //  System.out.println(arr[sx][sy]);
            return;
        }

        int index = 0;
        //正序
        if (asc){
            index = sy;
            for (;index <= my; index++){
                System.out.println(arr[sx][index]);
            }
            eachY(arr,sx+=1,sy,mx,my,true);
        }else{
            index = my;
            for (;index >= sy; index--){
                System.out.println(arr[mx][index]);
            }
            eachY(arr,sx,sy,--mx,my,false);
        }
    }

    /**
     * 处理纵向
     * @param arr
     * @param sx
     * @param sy
     * @param mx
     * @param my
     * @param asc
     *
     *  | |
     *  | |
     *  | |
     */
    private static void eachY(int[][] arr,int sx,int sy,int mx,int my,boolean asc){

        if (sx ==mx && sy==my){
            System.out.println(arr[sx][sy]);
            return;
        }

        if (sx>mx && sy>my){
          //  System.out.println(arr[sx][sy]);
            return;
        }

        //正序
        int index = 0;
        if (asc){
            index = sx;
            for (;index <= mx; index++){
                System.out.println(arr[index][my]);
            }
            eachX(arr,sx,sy,mx,--my,false);
        }else{
            index = mx;
            for (; index >= sx; index--){
                System.out.println(arr[index][sy]);
            }
            eachX(arr,sx,++sy,mx,my,true);
        }
    }

}
