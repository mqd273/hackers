package wang.lidong.leetcode;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author:lidongw_1
 * @Date 2022/8/3
 * @Description: 快排
 **/
public class FastSort {

    public static void main(String[] args) {

        int[] data = new int[]{3,2,5,30,2,4,5};

        ArrayList<Integer> integers = Lists.newArrayList(2, 1, 4, 3);

        //fastSort(0,data.length-1,data);

        System.out.println(Arrays.toString(data));

        sort(0,data.length-1,data);

        System.out.println(Arrays.toString(data));

    }


    private  static void sort(int start , int end, int[] list){
        if (start >= end)
            return;

        int left = start;
        int right = end;
        // 优化点 相加取平均值
        int num = list[start];
        while (left < right){
            while (left < right && list[left] <= num){
                left++;
            }

            while (right > left && list[right] >= num){
                right--;
            }

            //交换 left join 交换值  也可以不用临时变量交换
            if (left < right){
                int tem = list[left];
                list[left] = list[right];
                list[right] = tem;
            }
        }
        //左边
        sort(start,left ,list);
        //右边
        sort(right+1,end,list);
    }


    public static void fastSort(int start, int end,int[] data){

        if (start >= end){
            return;
        }

        int avg = data[start];
        //for(int i = start; i <= end; i++){
        //   avg += data[i] / (end - start + 1);
        //}

        int s = start;
        int e =end;
        //从左边遍历
        while (start < end){
            while (start < end && data[start] < avg){
                start++;
            }

            while (start < end && data[end] >= avg){
                end--;
            }

            if (start < end){
                int tmp =  data[start];
                data[start] = data[end];
                data[end] = tmp;
            }
        }


        fastSort(s,start,data);
        fastSort(end+1,e,data);
    }
}
